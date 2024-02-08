package com.codewithmosh.classes;

public class BinaryTree3 {
    /**
     * Node
     */
    public class Node {
        public int value;
        
        Node leftChild;
        Node rightChild;

        public Node(int v) {
            value = v;
        }
    
        public boolean isLeaf() {
            return leftChild == null && rightChild == null;
        }

        @Override
        public String toString() {
            return "Node=" + value;
        }
        
    }

    private Node root;

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
                    return;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    return;
                }
                current = current.rightChild;
            }
        }

    }
}
