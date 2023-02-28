package com.example.walmart.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramsTest {


    public static void main(String args[]) {
        List<String> words=new ArrayList<String>();
        List<List<String>> anagramsList = new ArrayList<>();

        words.add("Rat");
        words.add("Car");
        words.add("Below");
        words.add("Tast");
        words.add("Cried");
        words.add("Study");
        words.add("Thing");
        words.add("Chin");
        words.add("Grab");
        words.add("Act");
        words.add("Robed");
        words.add("Vase");
        words.add("Glean");
        words.add("Desserts");
        words.add("Tar");
        words.add("Arc");
        words.add("Elbow");
        words.add("State");
        words.add("Cider");
        words.add("Dusty");
        words.add("Night");
        words.add("Inch");
        words.add("Brag");
        words.add("Cat");
        words.add("Bored");
        words.add("Save");
        words.add("Angel");
        words.add("Streseed");

        for (int i = 0; i < words.size(); i++) {
            for (int j = i + 1; j < words.size(); j++) {
                char[] firstArr = words.get(i).toCharArray();
                char[] secArr = words.get(j).toCharArray();
                Arrays.sort(firstArr);
                String sortedFirst = new String(firstArr).toLowerCase();
                Arrays.sort(secArr);
                String sortedSec = new String(secArr).toLowerCase();
                if((firstArr.length == secArr.length) && sortedFirst.equals(sortedSec)) {
                    List<String> anagList = new ArrayList<>();
                    anagList.add(words.get(i));
                    anagList.add(words.get(j));
                    anagramsList.add(anagList);
                }
            }
        }
        System.out.println("Return anagrams list of list string are " + anagramsList);

    }


    //TODO:: Static method for checking both chars are equal
}
