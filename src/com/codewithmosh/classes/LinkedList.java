package com.codewithmosh.classes;

import java.util.Arrays;
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

    public int[] toArray() {

        Node current = first;

        int[] result = new int[length];

        int idx = 0;

        while (current != null) {
            result[idx++] = current.value;
            current = current.next;
        }

        return result;
    }

    public void reverse1() {
        System.out.println("Run reverse()");

        // [ 10 -> 20 -> 30 ]
        // [ 30 ]

        // var aFirst = first;
        // var aLast = last;

        // Node current = last;
        // // var previous = getPrevious(last);
        // Node previous = null;

        // while (previous != null) {
        // System.out.println(current.value);
        // previous = getPrevious(current);
        // // previous.next = null;
        // current = previous;
        // current.next = previous;
        // previous.next = null;

        // // previous = getPrevious(current);
        // // previous.next = null;
        // }

        // first.next = null;
        // var previous = getPrevious(last);

        // Node previous = null;

        Node current = last;
        var tmp = last;
        last = first;
        first = tmp;

        Node previous = null;

        while (current != null) {
            System.out.println(current.value);
            previous = getPrevious(current);
            current.next = previous;
            current = previous;
        }

        // var tmp = last;
        // last = first;
        // first = tmp;
    }

    public void reverse2() {
        System.out.println("Run reverse()");

        // [ 10 -> 20 -> 30 ]
        // [ 30 ]

        if (isEmpty())
            return;

        if (length <= 1)
            return;

        System.out.println("Initial: " + Arrays.toString(this.toArray()));

        var previous = first;
        var current = first.next;
        while (current != null) {
            // System.out.println("current.value=" + current.value);
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;
    }

    public void reverse3() {
        System.out.println("Run reverse()");

        // [ 10 -> 20 -> 30 ]
        // [ 30 ]

        // var aFirst = first;
        // var aLast = last;

        // Node current = last;
        // // var previous = getPrevious(last);
        // Node previous = null;

        // while (previous != null) {
        // System.out.println(current.value);
        // previous = getPrevious(current);
        // // previous.next = null;
        // current = previous;
        // current.next = previous;
        // previous.next = null;

        // // previous = getPrevious(current);
        // // previous.next = null;
        // }

        // first.next = null;
        // var previous = getPrevious(last);

        // Node previous = null;

        Node current = last;
        Node previous = null;
        Node next = null;

        do {
            System.out.println("current.value=" + current.value);
            previous = getPrevious(current);
            next = current.next;
            current.next = previous;
            // current = current.next;
        } while (next != null);

        // var tmp = last;
        // last = first;
        // first = tmp;

        // var tmp = last;
        // last = first;
        // first = tmp;
    }

    public void reverseUsingAddFirst() {
        System.out.println("Run reverse()");

        // [ 10 -> 20 -> 30 ]
        // [ 30 ]

        var copy = new LinkedList();

        var current = first;

        while (current != null) {
            copy.addFirst(current.value);
            current = current.next;
        }

        first = copy.first;
        last = copy.last;
        length = copy.length;

        // copy.print();

        // Node current = last;
        // // var previous = getPrevious(last);
        // Node previous = null;

        // // while (current != first) {
        // while (current != first) {
        // System.out.println(current.value);
        // previous = getPrevious(current);
        // // previous.next = null;
        // current = previous;
        // current.next = previous;
        // previous.next = null;

        // // previous = getPrevious(current);
        // // previous.next = null;
        // }

        // // first.next = null;

        // // do {
        // // System.out.println(current.value);

        // // previous = getPrevious(current);

        // // current.next = previous;

        // // } while (current != first);

    }

    // addFirst
    // addLast
    // deleteFirst
    // deleteLast
    // addFirst
    // contains
    // indexOf
    // size
    // toArray
    // reverse
}
