package hw2;

public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public  String whileLoop() {
        String result = "";
        int i = 0;
        while (i < personArray.length){
            String person = personArray[i].toString();
            result += person;
            i++;
        }
        return result;
    }


        public String forLoop () {
            String result = "";
          for (int i = 0; i< personArray.length; i++){
              String person = personArray[i].toString();
              result += person;
          }
            return result;
        }


        public String forEachLoop () {
            String result = "";
            for (Person x : personArray) {
                String person = x.toString();
                result += person;
            }
            return result;
        }


        public Person[] getPersonArray () {
            return personArray;
        }

    public static void main(String[] args) {
        Person julia = new Person("Julia", "Jones");
        Person lisa = new Person("Lisa", "Karen");
        Person sarah = new Person("Sarah", "Jackson");
        Person [] persons = {julia, lisa, sarah};
        PersonHandler p = new PersonHandler(persons);
        System.out.println(p.whileLoop());
        System.out.println(p.forLoop());
        System.out.println(p.forEachLoop());

    }
    }
