package com.codewithmosh;

import java.util.HashMap;
import java.util.Map;

import com.codewithmosh.classes.CharFinder;

public class HashTableSection {
    public static void main(String[] args) {
        System.out.println("Hash Tables Section...\n");

        // intro();

        // Exercise: Find the first non repeated word from...
        // a green apple

        var finder = new CharFinder();
        System.out.println(finder.getFirstNonRepeatingChar("a green apple"));

    }

    private static void intro() {
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
