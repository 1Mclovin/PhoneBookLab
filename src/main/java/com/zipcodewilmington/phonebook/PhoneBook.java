package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {
    // this needed to be modified to linked hash map to work idky
    private Map<String, List<String>> phonebook = new LinkedHashMap<>();


    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    public PhoneBook() {

    }

    public void add(String name, String phoneNumber) {
        phonebook.put(name, Collections.singletonList(phoneNumber));

    }

    public void addAll(String name, String... phoneNumbers) {
        phonebook.put(name, Arrays.asList(phoneNumbers));
    }

    public void remove(String name) {
        phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {

        if(phonebook.containsValue(name)){
            return true;
        }
        return false;
    }

    public List<String> lookup(String name) {

        // String getNumber = phonebook.get(name)+name.
        return phonebook.get(name);
    }

    public String reverseLookup(String phoneNumber)  {

        String lookUp = String.valueOf(phonebook.get(phoneNumber));
        return lookUp;
    }

    public List<String> getAllContactNames() {

       List<String> contactNames = new ArrayList<>();
       // looping through and selecting the keys
        for(String key: phonebook.keySet()){
            contactNames.add(key);
        }// now just return the list we created
        return contactNames;
    }

    public Map<String, List<String>> getMap() {
        return phonebook;
    }

}
