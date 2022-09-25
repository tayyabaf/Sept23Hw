package hw3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        //creating phonebook object
        PhoneBook myPhonebook = new PhoneBook();

        //trying "add" method
        myPhonebook.add("Suzy", "9090");
        myPhonebook.add("Kasey", "2226");

        //trying "addAll" method
        myPhonebook.addAll("Mil", "5656", "7676", "6997");
        myPhonebook.addAll("Julian", "4444", "8504");
        myPhonebook.addAll("Lisa", "3024", "4920");

        //trying "remove" method
        myPhonebook.remove("Julian");

        //trying "hasEntry" method
        System.out.println("HASENTRY METHOD:");
        System.out.println(myPhonebook.hasEntry("Julian"));
        System.out.println(myPhonebook.hasEntry("Kasey"));

        //trying "lookup" method
        System.out.println("LOOKUP METHOD:");
        System.out.println(myPhonebook.lookup("Mil"));

        //trying "reverseLookup" method
        System.out.println("REVERSELOOKUP METHOD:");
        System.out.println(myPhonebook.reverseLookup("7676"));

        //trying "getAllContactNames" method FAILED!!!! FIX THE METHOD
        System.out.println("GETALLCONTACTNAMES METHOD:");
        System.out.println(myPhonebook.getAllContactNames());

        //trying "getMap" method
        System.out.println("GETMAP METHOD:");
        System.out.println(myPhonebook.getMap());
    }
}
