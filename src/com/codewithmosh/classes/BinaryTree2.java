package com.codewithmosh.classes;

public class BinaryTree2 {
    /**
     * Node
     */
    public class Node {
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

    private Node root;

    public boolean find(int value) {
        if (root == null)
            throw new IllegalStateException();

        var current = root;
        while (current != null) {
            if (value == current.value)
                return true;
            current = value < current.value
                    ? current.leftChild
                    : current.rightChild;
        }
        return false;
    }

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }

        var current = root;
        while (true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = new Node(value);
                    break;
                }
                current = current.leftChild;

            } else {
                if (current.rightChild == null) {
                    current.rightChild = new Node(value);
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public void traversePreOrder() {
        System.out.println("RUN traversePreOrder");
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root) {
        // root (print)
        // left
        // right

        if (root == null)
            return;

        System.out.print(root.value + " ");
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    public void traverseInOrder() {
        System.out.println("\nRUN traverseInOrder");
        traverseInOrder(root);
    }

    private void traverseInOrder(Node root) {
        // left 
        // root (print)
        // right

        if (root == null)
            return;

        traverseInOrder(root.leftChild);
        System.out.print(root.value + " ");
        traverseInOrder(root.rightChild);
    }

    public void traversePostOrder() {
        System.out.println("\nRUN traversePostOrder");
        traversePostOrder(root);
    }

    private void traversePostOrder(Node root) {
        // left
        // right
        // root (print)

        if (root == null)
            return;

        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.print(root.value + " ");

    }

}
