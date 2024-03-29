package com.codewithmosh.classes;

public class BinaryTree4 {
    private class Node {
        private int value;
        public Node leftChild;
        public Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        public boolean isEmpty() {
            return leftChild != null && rightChild != null;
        }

        @Override
        public String toString() {
            return "Node=" + value;
        }
    }

    public Node root;

    public void insert(int value) {

        var node = new Node(value);

        if (root == null) {
            root = node;
            return;
        }

        var current = root;

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

    public boolean find(int value) {
        var current = root;

        while (current != null) {
            if (current.value == value)
                return true;
            current = (value < current.value)
                    ? current.leftChild
                    : current.rightChild;
        }

        return false;
    }
}
