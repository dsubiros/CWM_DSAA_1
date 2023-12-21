package com.codewithmosh.classes;

import java.util.Arrays;

public class Array {

    // int[] data = new int[0];
    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public void insert(int item) {
        System.out.println("Run insert(" + item + ")");

        if (items.length == count) {
            // Create a new array (twice the size)
            int[] newItems = new int[count * 2];

            // Copy all the existing items
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }

            // Set "items" to this new array
            items = newItems;
        }

        items[count++] = item;

    }

    public void removeAt(int idx) {
        System.out.println("Run removeAt(" + idx + ")");

        // Validate the index
        if (idx < 0 || idx >= count)
            throw new IllegalArgumentException();

        // All items after the deleted one should be shifted to fill the hole
        for (int i = idx; i < count; i++) {
            items[i] = items[i + 1];
        }

        items[count] = 0;
        count--;
    }

    public int indexOf(int item) {
        System.out.println("Run indexOf(" + item + ")");

        //O(n)
        for (int i = 0; i < count; i++)
            if (items[i] == item)
                return i;

        return -1;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}