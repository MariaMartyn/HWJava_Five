package org.example;

import java.lang.reflect.Array;
import java.util.*;

public class Phonebook {

    private static HashMap<String, ArrayList<String>> pb = new HashMap<>();



    static void addPerson(String name, String surname) {
        if(pb.containsKey(name)) {
            pb.get(name).add(surname);
        } else {
            ArrayList<String> values = new ArrayList<>();
            values.add(surname);
            pb.put(name, values);
        }
    }

    public static HashMap<String, Integer> getPhonebook() {
        HashMap<String, Integer> forSort = new HashMap<>();
        for (var item : pb.entrySet()) {
            forSort.put(item.getKey(), item.getValue().size());
        }
        System.out.println("Имена в телефонном справочнике, отсортированные по убыванию популярности: ");
        forSort.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).forEach(System.out::println);
        return forSort;
    }


}



