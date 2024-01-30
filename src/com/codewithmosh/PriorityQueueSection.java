package com.codewithmosh;

import com.codewithmosh.classes.PriorityQueue;

public class PriorityQueueSection {
    public static void main(String[] args) {
        System.out.println("Welcome to PriorityQueueSection...");

        m1();

    }

    public static void m1() {
        var q = new PriorityQueue(5);

        q.add(1);
        q.add(3);
        q.add(5);
        q.add(7);
        System.out.println(q.toString());
        q.add(2);
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
