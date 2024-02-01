package com.codewithmosh.classes;

public class BinaryTree {

    /**
     * Node
     */
    private class Node {
        public int value;
        public Node leftChild;
        public Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node=" + value;
        }

    }

    /**
     * Tree
     */
    // private class Tree {
    // public Node root;
    // }

    // private Tree tree = new Tree();
    private Node root;

    public void insert(int value) {
        System.out.println("Insert " + value);

        var node = new Node(value);

        if (root == null) {
            root = node;
            return;
        }

        Node current = root;

        while (true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    // Tree (root)
    // Node (value, leftChild, rightChild)
    // insert(value)
    // find(value):boolean

    // var current = root;
    // current = current.leftChild;
}
