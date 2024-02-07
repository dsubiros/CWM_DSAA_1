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

        public boolean isLeaf() {
            return leftChild == null && rightChild == null;
        }

    }

    private Node root;

    public Node getRoot() {
        return root;
    }

    public boolean isEmpty() {
        return root == null;
    }

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

    public int height() {
        System.out.print("\nRUN height: ");
        return this.height(root);
    }

    private int height(Node root) {
        if (root == null)
            return -1;

        if (root.isLeaf())
            return 0;

        return 1 + Math.max(
                height(root.leftChild),
                height(root.rightChild));

    }

    public int minValue() {
        System.out.print("\nRUN minValue: ");
        return this.minValue(root);
    }

    private int minValue(Node root) {
        if (root.isLeaf())
            return root.value;

        var left = minValue(root.leftChild);
        var right = minValue(root.rightChild);

        return Math.min(Math.min(left, right), root.value);
    }

    // In a Binary Search Tree, this is always true: left < root < right
    private int minValueOfBinarySearchTree() {
        if (root == null)
            throw new IllegalStateException();

        var current = root;
        var last = current;

        while (current != null) {
            last = current;
            current = current.leftChild;
        }

        return last.value;
    }

    public boolean isLeaf(Node node) {
        return node.leftChild == null && node.rightChild == null;
    }

    public boolean equals(BinaryTree2 other) {
        if (other == null)
            return false;

        return equals(root, other.getRoot());
    }

    private static boolean equals(Node first, Node second) {
        if (first == null || second == null) {
            return true;
        }

        if (first != null && second != null)
            return first.value == second.value
                    && equals(first.leftChild, second.leftChild)
                    && equals(first.rightChild, second.rightChild);

        return false;
    }

    public boolean isBinarySearchTree() {
        if (root == null)
            throw new IllegalStateException();

        return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBinarySearchTree(Node root, int min, int max) {

        if (root == null)
            return true;

        if (root.value < min || root.value > max)
            return false;

        return isBinarySearchTree(root.leftChild, min, root.value - 1)
                && isBinarySearchTree(root.rightChild, root.value + 1, max);
    }

    public void swapRoot() {
        var temp = root.leftChild;
        root.leftChild = root.rightChild;
        root.rightChild = temp;
    }

}
