package com.codewithmosh;

import com.codewithmosh.classes.LinkedList;
import com.codewithmosh.classes.Node;

public class LinkedListSection {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Node node1 = new Node(10);
        // Node node1 = new Node(10);
        // Node node1 = new Node(10);

        list.addLast(new Node(10));
        list.addLast(new Node(20));
        list.addLast(new Node(30));
        list.addFirst(new Node(101));
        list.addFirst(new Node(102));        
        list.print();
        list.deleteLast();
        list.print();
        list.deleteLast();
        list.print();
        list.deleteFirst();
        list.print();

        // System.out.println(list.indexOf(20));

    }
}
