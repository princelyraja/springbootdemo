package com.example.walmart.demo;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class NameSorting {

    public static void main(String args[]) {

        Map<Integer, String> namesMap=new HashMap<Integer, String>();

        namesMap.put(101, "Hemendra");
        namesMap.put(99, "Andrew");
        namesMap.put(103, "Anish");
        namesMap.put(18, "Mohan");
        namesMap.put(11, "Christine");
        namesMap.put(109, "Rebeca");
        namesMap.put(111, "David");
        namesMap.put(19, "Rahim");
        namesMap.put(10, "Krishna");

        namesMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(sortedMap -> System.out.println(sortedMap.getKey()+"="+sortedMap.getValue()));


    }
}
