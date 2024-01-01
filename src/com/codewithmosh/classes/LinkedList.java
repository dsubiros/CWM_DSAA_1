package com.codewithmosh.classes;

import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int length = 0;

    private boolean isEmpty() {
        return this.first == null;
    }

    // O(1)
    public int length() {
        return length;
    }

    public Node getFirst() {
        return first;
    }

    public void addFirst(int item) {
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }

        length++;
    }

    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }

        length++;
    }

    public void removeFirst() {
        print();
        System.out.println("Run 'removeFirst()' (first is now " + first.value + ")");

        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;

        }

        else {
            var second = first.next;
            first.next = null;
            first = second;
        }

        length--;
    }

    public void removeLast() {
        print();
        System.out.println("Run 'removeLast()' (last is now " + last.value + ")");
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
        }

        else {
            var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        
        length--;

        System.out.println();

    }

    private Node getPrevious(Node node) {
        var current = first;

        while (current != null) {
            if (current.next == node)
                return current;
            current = current.next;
        }

        return null;

    }

    public Node getLast() {
        return last;
    }

    public void print() {
        var current = first;

        var str = "[";

        while (current != null) {
            str += (str == "[" ? "" : ", ") + String.valueOf(current.value);
            current = current.next;
        }

        System.out.println(str += "]\n");
    }

    public int indexOf(int item) {
        int idx = 0;

        var current = first;

        while (current != null) {
            // System.out.println(current.value);
            if (current.value == item)
                return idx;
            current = current.next;
            idx++;
        }

        return -1;
    }

    // O(n)
    // public int getSize() {
    // int count = 0;
    // var current = first;

    // while (current != null) {
    // current = current.next;
    // count++;
    // }

    // return count;
    // }

    public boolean contains(int value) {
        System.out.println("Run 'contains(" + value + ")'");
        return this.indexOf(value) != -1;
    }

    // addFirst
    // addLast
    // deleteFirst
    // deleteLast
    // addFirst
    // contains
    // indexOf
    // size
}
