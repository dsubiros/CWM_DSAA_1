package com.codewithmosh.classes;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack {
    private int[] items = new int[5];
    private int count;

    public MyStack() {
        for (int i = 0; i < items.length; i++) {
            items[i] = 0;
        }
    }

    private boolean isEmpty() {
        return count == 0;
    }

    public int pop() {
        System.out.println("Pop: " + peek());

        if (isEmpty())
            throw new EmptyStackException();

        return items[--count];
    }

    public int peek() {
        if (isEmpty())
            throw new EmptyStackException();

        return items[count - 1];
    }

    public void push(int item) {
        System.out.println("Push: " + item);
        if (count == items.length) {
            var copy = new int[count * 2];

            for (int i = 0; i < count; i++)
                copy[i] = items[i];
            items = copy;
        }

        items[count++] = item;
    }

    public void print() {
        System.out.println("\n");
        
        for (int i = count - 1; i > -1; i--)
            System.out.println(items[i]);
            // System.out.println(items[i] + "\n");

        System.out.println("\n");
    }

    @Override
    public String toString() { 
        return Arrays.toString(Arrays.copyOfRange(items, 0, count));
    }


    // push
    // pop
    // peek
    // isEmpty

}
