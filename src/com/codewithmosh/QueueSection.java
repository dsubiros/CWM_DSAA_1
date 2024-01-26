package com.codewithmosh;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

import com.codewithmosh.classes.ArrayQueue;
import com.codewithmosh.classes.ArrayQueue1;
import com.codewithmosh.classes.StackedQueue;

public class QueueSection {
    public static void main(String[] args) {
        System.out.println("Queue Section");
        // queue1();
        // queue2();

        stackedQueue();

    }

    public static void stackedQueue() {
        var queue = new StackedQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);        
        System.out.println(queue.dequeue());
        // System.out.println(queue.dequeue());
        // System.out.println(queue.dequeue());

        System.out.println(queue.dequeue());
        

    }

    // public static void stackedQueue() {
    //     var queue = new StackedQueue();

    //     queue.enqueue(10);
    //     queue.enqueue(20);
    //     queue.enqueue(30);
    //     queue.enqueue(40);
    //     queue.enqueue(50);
    //     System.out.println(queue);

    //     queue.dequeue();
    //     System.out.println(queue);
    //     queue.dequeue();
    //     System.out.println(queue);
    //     queue.dequeue();
    //     System.out.println(queue);

    //     queue.enqueue(60);
    //     queue.enqueue(70);
    //     System.out.println(queue);
        
    //     queue.dequeue();
    //     System.out.println(queue);

    // }

    public static void queue2() {
        var q = new ArrayQueue1(5);

        q.add(10);
        q.peek();
        q.add(20);
        q.add(30);
        q.peek();
        System.out.println(q.toString());

        q.add(40);
        q.add(50);
        System.out.println(q.toString());
        q.remove();
        System.out.println(q.toString());
        q.add(60);
        System.out.println(q.toString());
        q.remove();
        System.out.println(q.toString());
        q.peek();
        q.remove();
        System.out.println(q.toString());
        q.add(70);
        System.out.println(q.toString());
        q.add(80);
        q.peek();
        System.out.println(q.toString());
    }

    public static void queue1() {
        // Queue<Integer> queue = new ArrayDeque<>();
        // queue.add(10);
        // queue.add(20);
        // queue.add(30);
        // System.out.println(queue);
        // queue.remove();
        // System.out.println(queue);

        // reverse(queue);
        // System.out.println(queue);

        var queue = new ArrayQueue(5);

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        // queue.add(60);

        System.out.println(queue + "\n");

        var front = queue.remove();
        System.out.println("Removed: " + front);
        System.out.println(queue + "\n");

        front = queue.remove();
        System.out.println("Removed: " + front);
        System.out.println(queue + "\n");

        front = queue.remove();
        System.out.println("Removed: " + front);
        System.out.println(queue + "\n");

        front = queue.remove();
        System.out.println("Removed: " + front);
        System.out.println(queue + "\n");

        // queue.remove();
        // System.out.println(queue);
        // System.out.println(queue.count());
        queue.add(60);
        System.out.println(queue + "\n");
        queue.add(70);
        System.out.println(queue + "\n");
        queue.add(80);
        System.out.println(queue + "\n");
        queue.add(90);
        System.out.println(queue + "\n");
        front = queue.remove();
        System.out.println("Removed: " + front);
        System.out.println(queue + "\n");
        front = queue.remove();
        System.out.println("Removed: " + front);
        System.out.println(queue + "\n");
        front = queue.remove();
        System.out.println("Removed: " + front);
        System.out.println(queue + "\n");
        queue.add(80);
        System.out.println(queue + "\n");
        queue.add(100);
        System.out.println(queue + "\n");
        queue.add(200);
        System.out.println(queue + "\n");
        front = queue.remove();
        System.out.println("Removed: " + front);
        System.out.println(queue + "\n");
        front = queue.remove();
        System.out.println("Removed: " + front);
        System.out.println(queue + "\n");

        // queue.add(300);
        // System.out.println(queue + "\n");
        // queue.add(100);
        // System.out.println(queue + "\n");
        // front = queue.remove();
        // System.out.println("Removed: " + front);
        // System.out.println(queue + "\n");
        // queue.add(100);
        // System.out.println(queue + "\n");
    }

    // add
    // remove
    // isEmpty
    public static void reverse(Queue<Integer> queue) {
        System.out.println("Reversing queue...");
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty())
            stack.add(queue.remove());

        while (!stack.isEmpty())
            queue.add(stack.pop());
    }

}
