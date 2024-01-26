package com.codewithmosh.classes;

import java.util.Arrays;

public class ArrayQueue1 {

    private int[] items;
    private int front = 0;
    private int rear = 0;
    private int count = 0;

    public ArrayQueue1(int MAX) {
        items = new int[MAX];

    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }

    public void add(int item) {
        System.out.println("Add " + item);

        if (isFull())
            throw new IllegalStateException();

        items[rear] = item;
        rear = (rear + 1) % items.length;

        count++;
    }

    public int remove() {
        if (isEmpty())
            throw new IllegalStateException();

        var item = items[front];
        System.out.println("Remove " + item);

        items[front] = 0;
        front = (front + 1) % items.length;

        count--;
        return item;
    }

    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();
            
        var item = items[front];
        System.out.println("Peek " + item);

        return item;
    }

    @Override
    public String toString() {
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
