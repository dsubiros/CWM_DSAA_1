package com.codewithmosh;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.codewithmosh.classes.CharFinder;

public class HashTableSection {
    public static void main(String[] args) {
        System.out.println("Hash Tables Section...\n");

        // introToHashMaps();

        // Exercise: Find the first non repeated word from...
        // a green apple

        // getFirstNonRepeatingChar();

        // introToSets();

        findFirstRepeatedChar();

    }

    private static void findFirstRepeatedChar() {
        CharFinder finder = new CharFinder();
        System.out.println("First repeated char: " + finder.findFirstRepeatedChar("green apple"));
    }

    private static void introToSets() {
        Set<Integer> set = new HashSet<>();
        int[] numbers = { 1, 2, 2, 3, 4, 5, 5 };
        for (int number : numbers)
            set.add(number);

        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Set: " + set);
    }

    private static void getFirstNonRepeatingChar() {
        var finder = new CharFinder();
        System.out.println(finder.findFirstNonRepeatingChar("a green apple"));
    }

    private static void introToHashMaps() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Mosh");
        map.put(2, "John");
        map.put(3, "Mary");
        map.put(3, "Marie");
        map.put(null, null);
        map.remove(null);
        System.out.println(map);
        // var value = map.get(3);
        // System.out.println(value);
        // map.containsKey(3);
        // map.containsValue("Mary");

        for (var key : map.keySet())
            System.out.println(map.get(key));

        System.out.println("\n");

        for (var item : map.entrySet())
            System.out.println(item);
    }
}
