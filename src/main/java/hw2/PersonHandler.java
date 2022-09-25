package hw2;

public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        int i = 0;
        while (i < personArray.length) {
            String person = personArray[i].toString();
            i++;
            return person;
        }
        return result;
    }


        public String forLoop () {
            String result = "";
          for (int i = 0; i< personArray.length; i++){
              String person = personArray[i].toString();
              return person;
          }
            return result;
        }


        public String forEachLoop () {
            String result = "";
            for (Person x : personArray) {
                String person = x.toString();
                return person;
            }
            return result;
        }


        public Person[] getPersonArray () {
            return personArray;
        }

    }
