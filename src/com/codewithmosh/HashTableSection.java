package com.codewithmosh;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

import com.codewithmosh.classes.CharFinder;
import com.codewithmosh.classes.MyHashTable;

public class HashTableSection {
    public static void main(String[] args) {
        System.out.println("Hash Tables Section...\n");

        // introToHashMaps();

        // Exercise: Find the first non repeated word from...
        // a green apple

        // getFirstNonRepeatingChar();

        // introToSets();

        // findFirstRepeatedChar();

        // System.out.println(intHash(123456));

        // System.out.println(stringHash("123456-A"));

        customHashTable();

    }

    private static void customHashTable() {
        MyHashTable table = new MyHashTable(5);

        table.put(1, "Hello 1a");
        table.put(1, "Hello 1b");
        table.put(1, "Hello 1c");
        table.put(11, "Hello 11");
        table.put(2, "Hello 2");
        table.put(4, "Hello 4");
        table.put(1000, "Hello 1000");
        table.put(1007, "Hello 1001");

        System.out.println("\n" + table);

        System.out.println("Get entry V: 1007, " + table.get(1007));
        System.out.println("Get entry V: 1, " + table.get(1));
        System.out.println("Remove V: 1... ");
        table.remove(1);
        System.out.println("Get entry V: 1, " + table.get(1));


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

    private static int intHash(int number) {
        // items[1] = "Mosh"
        // 100
        // 0 - 99

        return number % 100;
    }

    private static int stringHash(String key) {
        // items[1] = "Mosh"
        // 100
        // 0 - 99

        var hash = 0;

        for (var ch : key.toCharArray()) {
            hash += ch;
        }

        return hash % 100;
    }
}
