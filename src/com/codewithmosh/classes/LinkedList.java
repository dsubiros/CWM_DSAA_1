package com.codewithmosh.classes;

public class LinkedList {
    private Node first;
    private Node last;

    public Node getFirst() {
        return first;
    }

    public void addFirst(Node node) {
        if (this.first == null) {
            this.first = this.last = node;
        } else {
            node.setNext(this.first);
            this.first = node;
        }
    }

    public void addLast(Node node) {
        if (this.first == null) 
            first = last = node; 
         else {
            last.setNext(node);
            last = node;
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
        Node current = this.first;

        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    public int indexOf(int value) {
        int idx = -1;

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

    public boolean contains(int value) {
        System.out.println("Run 'contains(" + value + ")'");

        Node current = this.first;

        while (current != null) {
            if (current.getValue() == value)
                return true;
            current = current.getNext();
        }

        return false;
    }

    // addFirst
    // addLast
    // deleteFirst
    // deleteLast
    // addFirst
    // contains
    // indexOf

}
