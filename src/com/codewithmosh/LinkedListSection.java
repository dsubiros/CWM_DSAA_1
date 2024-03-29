package com.codewithmosh;

import java.util.Arrays;

import com.codewithmosh.classes.LinkedList;

public class LinkedListSection {
    public static void main(String[] args) {
        var list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addFirst(101);
        list.addFirst(102);
        list.print();
        System.out.println(list.contains(50));
        list.removeLast();

        System.out.println(list.contains(50));
        list.removeLast();

        System.out.println("Current list size is " + list.length());

        list.removeFirst();
        list.print();

        System.out.println("Index of '" + 101 + "' is " + list.indexOf(101) + "  (should be 0)");
        System.out.println("Index of '" + 20 + "'  is " + list.indexOf(20) + "  (should be 2)");
        System.out.println("Index of '" + 500 + "' is " + list.indexOf(500) + " (should be -1)");
        System.out.println("Current list size is " + list.length());
        System.out.println("Run toArray() => " + Arrays.toString(list.toArray()));

        list.reverseUsingAddFirst();
        list.print();
        list.reverseUsingAddFirst();
        list.print();
        // list.reverseUsingAddFirst();
        // list.print();

        System.out.println("--------------------------" + Arrays.toString(list.toArray()));

        list.removeFirst();
        list.addLast(40);
        list.addLast(50);

        list.reverse2();
        list.print();

        var kth = 3;
        System.out.println("Kth=" + kth + " is \"" + list.getKthFromTheEnd(kth) + "\"");
        

        // list.reverse2();
        // list.print();
        // list.reverse2();
        // list.print();

    }
}
