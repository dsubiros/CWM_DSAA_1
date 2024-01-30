package com.codewithmosh;

import com.codewithmosh.classes.PriorityQueue;

public class PriorityQueueSection {
    public static void main(String[] args) {
        System.out.println("Welcome to PriorityQueueSection...");

        m1();

    }

    public static void m1() {
        var q = new PriorityQueue(5);

        q.insert(1);
        q.insert(3);
        q.insert(5);
        q.insert(7);
        System.out.println(q.toString());
        q.insert(2);
        System.out.println(q.toString());
        q.remove();
        // System.out.println(q.toString());
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        System.out.println(q.toString());


    }
}
