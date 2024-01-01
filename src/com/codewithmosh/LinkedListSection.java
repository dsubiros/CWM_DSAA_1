package com.codewithmosh;

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

    }
}
