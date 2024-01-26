package com.codewithmosh.classes;

import java.util.Stack;

public class StackedQueue {

    private Stack<Integer> s1 = new Stack<Integer>();
    private Stack<Integer> s2 = new Stack<Integer>();

    // private final int MAX;
    // private int count;

    // O(1)
    public void enqueue(int item) {
        s1.push(item);
    }

    // O(n)
    public int dequeue() {
        if (isEmpty())
            throw new IllegalStateException();

        moveStack1ToStack2();

        return s2.pop();
    }
    
    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();

        moveStack1ToStack2();

        return s2.peek();
    }

    private void moveStack1ToStack2() {
        if (s2.isEmpty())
            while (!s1.isEmpty())
                s2.push(s1.pop());
    }

    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    // @Override
    // public String toString() {
    //     return ;
    // }

    // public StackedQueue(int max) {
    // this.MAX = max;
    // stack = new Stack<Integer>();
    // }

    // public boolean isEmpty() {
    // return count == 0;
    // }

    // public boolean isFull() {
    // return count == MAX;
    // }

    // public void enqueue(int item) {
    // if (isFull())
    // throw new StackOverflowError();

    // System.out.println("Enqueue " + item);
    // stack.push(item);
    // count++;
    // }

    // public int dequeue() {
    // if (isEmpty())
    // throw new IllegalStateException();

    // var copy = new Stack<Integer>();

    // while (stack.size() != 1)
    // copy.push(stack.pop());

    // var item = stack.pop();
    // count--;

    // while (!copy.isEmpty())
    // stack.push(copy.pop());

    // System.out.println("Dequeue " + item);

    // return item;

    // }

    // @Override
    // public String toString() {
    // return stack.toString();
    // }
}
