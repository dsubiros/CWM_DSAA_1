package com.codewithmosh.classes;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayQueue {

    // private final int MAX = 5;

    private int[] items;
    private int front = 0;
    private int rear = 0;

    private int count = 0;

    public ArrayQueue(int max) {
        items = new int[max];
    }

    // public int count() {
    // // return front - rear + 1;
    // return rear - front;
    // }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }

    public void add(int item) {
        if (isFull())
            throw new IllegalStateException();

        // if (rear == items.length)
        //     rear = 0;

        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
        System.out.println("Count is now " + count);
    }

    public int remove() {
        if (isEmpty())
            throw new NoSuchElementException();

        var item = items[front];
        items[front] = 0;
        
        front = (front + 1) % items.length;

        count--;
        return item;
    }

    @Override
    public String toString() {

        // return Arrays.toString(this.items);

        // return Arrays.toString(Arrays.copyOfRange(this.items, front, rear));
        return Arrays.toString(this.items);
    }

    // enqueue
    // dequeue
    // peek
    // isEmpty
    // isFull
    // [10, 20, 30, 40, 50]
    // F R
    // F = 0
    // R = 4

}
