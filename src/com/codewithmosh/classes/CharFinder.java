package com.codewithmosh.classes;

import java.util.HashMap;
import java.util.Map;

public class CharFinder {
    public char getFirstNonRepeatingChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        var chars = str.toCharArray();

        for (var ch : chars) {
            var count = map.containsKey(ch) ? map.get(ch) : 0;
            map.put(ch, count + 1);
        }

        System.out.println(map);

        for (var ch : chars)
            if (map.get(ch) == 1) {
                System.out.println("Solution: \"" + ch + "\"");
                return ch;
            }

        return Character.MIN_VALUE;
    }
}
