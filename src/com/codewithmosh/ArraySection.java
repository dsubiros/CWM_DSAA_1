package com.codewithmosh;

import com.codewithmosh.classes.Array;

public class ArraySection {
    public static void main(String[] args) throws Exception {
        System.out.println("\nHello, World 2!");

        // Lookup O(1)
        // Insert O(n)
        // Delete O(n)

        // int[] numbers = { 10, 20, 30 };
        // System.out.println(Arrays.toString(numbers));

        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.print();

        // numbers.removeAt(3);
        // numbers.print();

        // numbers.removeAt(2);
        // numbers.removeAt(0);
        // numbers.print();

        System.out.println(numbers.indexOf(30));
        System.out.println(numbers.indexOf(100));

    }

}
