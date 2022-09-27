package stringsandthingshw;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public static Integer countYZ(String input) {
        Integer counter = 0;
        input = input.toLowerCase();
        if (input.charAt(input.length() - 1) == 'z' || input.charAt(input.length() - 1) == 'y') {
            counter++;
        }
        for (int i = 0; i < input.length() - 1; i++) {
            if ((input.charAt(i) == 'z' || input.charAt(i) == 'y') && !Character.isLetter(input.charAt(i + 1))) {
                counter++;
            }
        }
        return counter;
    }

        /**
         * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
         * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
         * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
         *
         * example : removeString("Hello there", "llo") // Should return "He there"
         *           removeString("Hello there", "e") //  Should return "Hllo thr"
         *           removeString("Hello there", "x") // Should return "Hello there"
         */
        public static String removeString (String base, String remove){
            String result = base.replaceAll(remove, "");
            return result;
        }

        /**
         * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
         * to the number of appearances of "not" anywhere in the string (case sensitive)
         *
         * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
         *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
         *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
         */
        public static Boolean containsEqualNumberOfIsAndNot (String input){
            int isCounter = 0;
            int notCounter=0;
            Boolean equalStatus;
            input = input.toLowerCase();

            for(int i = 0; i<input.length()-1; i++){
                if (input.charAt(i)=='i' && input.charAt(i+1)=='s'){
                    isCounter++;
                }
                if (input.charAt(i)=='n' && input.charAt(i+1)=='o' && input.charAt(i+2)=='t'){
                    notCounter++;
                }
            }

            if(isCounter==notCounter){
                equalStatus=true;
            }else{
                equalStatus=false;
            }
            return equalStatus;
        }

        /**
         * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
         * Return true if all the g's in the given string are happy.
         * example : gHappy("xxggxx") // Should return  true
         *           gHappy("xxgxx") // Should return  false
         *           gHappy("xxggyygxx") // Should return  false
         */

        //failed -- fixed
        public static Boolean gIsHappy (String input){
            Boolean happyStatus = false;
            for (int i = 0; i < input.length()-1; i++){
                if(input.charAt(i) == 'g' && input.charAt(i+1) == 'g' ){
                    happyStatus=true;
                }
            }
            return happyStatus;

        }


        /**
         * We'll say that a "triple" in a string is a char appearing three times in a row.
         * Return the number of triples in the given string. The triples may overlap.
         * example :  countTriple("abcXXXabc") // Should return 1
         *            countTriple("xxxabyyyycd") // Should return 3
         *            countTriple("a") // Should return 0
         */

        //do more research on this
        public static Integer countTriple (String input){
            Integer counter = 0;
            for(int i = 0; i<input.length()-1; i++) {
                char currentLetter = input.charAt(i);
                if (currentLetter == input.charAt(i + 1) && currentLetter == input.charAt(i + 2))
                    counter++;
            }
            return counter;

        }

    public static void main(String[] args) {
        System.out.println(countYZ("fez day"));

        System.out.println(removeString("Today is a great day to eat icecream", "to eat icecream"));

        System.out.println(containsEqualNumberOfIsAndNot("This is notnot"));

        System.out.println(gIsHappy("xxggyygxx")); // failed -- fixed
        System.out.println(countTriple("xxyyabyyycd"));
    }
    }
