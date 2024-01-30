package com.codewithmosh.classes;

import java.util.Arrays;

public class PriorityQueue {

    private int[] items;
    private final int MAX;
    private int count;

    private int front;

    public PriorityQueue(int max) {
        this.items = new int[this.MAX = max];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == MAX;
    }

    // public void add(int item) {
    // if (isFull())
    // throw new IllegalStateException();

    // items[rear] = item;
    // rear = (rear + 1) % items.length;
    // count++;
    // System.out.println("Count is now " + count);
    // }

    // insert(2)
    // [1, 3, 5, 7, 0]
    // 0 1 2 3 4
    // NO items[i + 1] = items[i]

    // Bigger number = higher priority
    public int remove() {
        if (isEmpty())
            throw new IllegalStateException();

        var item = items[--count];
        System.out.println("Remove: " + item);
        // front++;
        return item;
    }

    public void add(int item) {
        System.out.println("Insert: " + item);
        if (isFull())
            throw new StackOverflowError();

        int i = shiftItemsToInsert(item);
        items[i] = item;
        count++;
    }

    // Shift items to right
    private int shiftItemsToInsert(int item) {
        int i;
        for (i = count - 1; i >= front; i--) {
            if (items[i] > item)
                items[i + 1] = items[i];
            else
                break;
        }
        return i + 1;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(this.items, front, count));
    }

}
