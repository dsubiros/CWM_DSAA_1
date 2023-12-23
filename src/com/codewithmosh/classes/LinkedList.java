package com.codewithmosh.classes;

public class LinkedList {
    private Node first;
    private Node last;

    public Node getFirst() {
        return first;
    }

    public void addFirst(Node item) {
        if (this.first == null) {
            this.first = item;
            this.last = item;
        } else {
            item.setNext(this.first);
            this.first = item;
        }
    }

    public void addLast(Node item) {
        if (this.last == null) {
            this.first = item;
            this.last = item;
        } else {
            this.last.setNext(item);
            this.last = item;
        }
    }

    public void deleteFirst() {
        System.out.println("Run 'deleteFirst()' (last is now " + this.first.getValue() + ")");
        if (this.first == this.last) {
            this.first = this.last = null;
        } else {
            this.first = this.first.getNext();
        }
    }

    public void deleteLast() {
        System.out.println("Run 'deleteLast()' (last is now " + this.last.getValue() + ")");
        if (this.first == this.last) {
            this.first = this.last = null;
        } else {
            Node current = this.first;
            Node previous = null;

            while (current != this.last) {
                previous = current;
                current = current.getNext();
            }

            previous.setNext(null);
            this.last = previous;
            System.out.println();
        }
    }

    public Node getLast() {
        return last;
    }

    public void print() {
        // if (this.first == null)
        //     return;
        Node current = this.first;

        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public int indexOf(int value) {
        int idx = -1;
        // if (this.first == null)
        // return -1;

        Node current = this.first;

        while (current != null) {
            // System.out.println(current.getValue());
            idx++;
            if (current.getValue() == value)
                return idx;
            current = current.getNext();
        }

        return idx;

    }

    // addFirst
    // addLast
    // deleteFirst
    // deleteLast
    // addFirst
    // contains
    // indexOf

}
