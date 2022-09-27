package hw3;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PhoneBook {

    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = new HashMap<>();
    }

    public PhoneBook() {
        this(null);
    }

    public void add(String name, String phoneNumber) {
        List<String> listOfPhoneNumbers = new ArrayList<>();
        listOfPhoneNumbers.add(phoneNumber);
        phonebook.put(name, listOfPhoneNumbers);

    }

    public void addAll(String name, String... phoneNumbers) {
        List<String> listOfPhoneNumbers = new ArrayList<>();
        for (String x : phoneNumbers)
            listOfPhoneNumbers.add(x);
        phonebook.put(name, listOfPhoneNumbers);
    }

    public void remove(String name) {
        phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        Boolean entryStatus = phonebook.containsKey(name);
        return entryStatus;
    }

    public List<String> lookup(String name) {
        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber) {
        for (Map.Entry<String, List<String>> entry : phonebook.entrySet())
            if (entry.getValue().contains(phoneNumber)) {
                return entry.getKey();
            }
        return "Phone number not found";
    }

    public String getAllContactNames() {
        String result = "";
        for (String contacts : phonebook.keySet()) {
            result += contacts + ", ";
        }
        return result;
        }


        public Map<String, List<String>> getMap () {
            return phonebook;
        }
    }
