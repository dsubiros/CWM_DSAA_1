package com.codewithmosh.classes;

import java.util.Arrays;

public class PriorityQueue {

    private int[] items;
    private final int MAX;
    private int count;

    private int front;
    private int rear;

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

    public void insert(int item) {
        if (isFull())
            throw new StackOverflowError();

        // for (int i = ((rear - 1) % items.length); i > front; i--) {
        // int idx = rear;
        // int next = rear;

        // while(items[idx] >= item ){
        //     items[next] = items[idx];
        //     next = (next - 1) % items.length;
        //     // rear = (rear + 1) % items.length;
        // }

        // rear = (rear + 1) % items.length;
        // count++;

        // for (int i = rear; i >= front; i--) {
        //     if (item > items[rear]) {
        //         items[rear] = item;
        //     } else {
        //         // items[rear] = items[i];                
        //     }
        // }
        var prev = 0;

        for (int i = rear; i >= front; i--) {
            prev = (rear) % items.length;
            
            // if (item > items[rear]) {
                var prevValue = items[prev];

            if (item > items[prev]) {
                items[rear] = item;
            } else {
                // items[rear] = items[i];           
                var d = 1;     
            }
        }

        rear = (rear + 1) % items.length;
        count++;

        // Circular OK
        // for (int i = rear; i >= front; i--) {
        //     if (item > items[rear]) {
        //         items[rear] = item;
        //     } else {
        //     }
        // }
        // rear = (rear + 1) % items.length;
        // count++;

        // for (int i = rear; i >= front; i--) {
        //     // items[i + 1] = item > items[i] ? item : items[i];
        //     // items[(rear + 1) % items.length] = item > items[i] ? item : items[i];
        //     // var b = 1;
        //     // int idx = (rear + 1) % items.length;
        //     // int rear = (rear - 1) % items.length;
        //     // if (item > items[idx]) {

        //     // var prev = (rear - 1) % items.length;
        //     // var prev = (rear) % items.length;

        //     if (item > items[]) {
        //         items[rear] = item;
        //     } else {
        //         items[rear] = items[i];                
        //     }

        //     // if (items[rear] < item) {
        //     //     // var idx = (rear + 1) % items.length;
        //     //     items[rear] = item;
        //     // } else {
        //     //     var c = 1;
        //     //     // items[i + 1] = items[i];
        //     //     // items[items[(rear - 1) % items.length]] = items[i];
        //     //     // idx = (rear) % items.length;
        //     //     // idx = (rear) % items.length;
        //     //     // items[idx] = items[i];
        //     //     // rear = (rear + 1) % items.length;
        //     // }

        // }

        // rear = (rear + 1) % items.length;
        // count++;

        var a = 1;

    }

    @Override
    public String toString() {
        return Arrays.toString(this.items);
    }

}
