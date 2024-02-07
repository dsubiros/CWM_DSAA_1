package com.codewithmosh;

import com.codewithmosh.classes.BinaryTree2;
import com.codewithmosh.classes.BinaryTree2.Node;

public class BinaryTreeSection2 {
    public static void main(String[] args) {
        System.out.println("Hello from Binary Tree Section 2...\n");

        // insertIntoBinTree();
        // var number = 5;
        // System.out.println("Factorial of " + number + ": " + factorial(number));

        var tree = populateTree(new int[] { 7, 4, 9, 1, 6, 8, 10 });
        tree.traversePreOrder();
        tree.traverseInOrder();
        tree.traversePostOrder();

        height();

        minValue();

        equals();
    }

    private static void equals() {
        System.out.print("\nRUN equality: ");
        var tree = populateTree(new int[] { 7, 4, 9, 1, 6, 8, 10});
        var other = populateTree(new int[] { 7, 4, 9, 1, 6, 8, 10 });
        System.out.println(tree.equals(other));
    }

    

    private static void minValue() {
        var tree = populateTree(new int[] { 7, 4, 9, 1, 6, 8, 10 });
        System.out.println(tree.minValue());
    }

    private static void height() {
        var tree = populateTree(new int[] { 7, 4, 9, 1, 6, 8, 10 });
        // var tree = populateTree(new int[]{});
        System.out.println(tree.height());
    }

    private static BinaryTree2 populateTree(int[] numbers) {
        var tree = new BinaryTree2();

        for (int i : numbers)
            tree.insert(i);

        return tree;

        // tree.insert(7);
        // tree.insert(4);
        // tree.insert(9);
        // tree.insert(1);
        // tree.insert(6);
        // tree.insert(8);
        // tree.insert(10);

        // var a = 1;

        // System.out.println("Find " + 11 + ": " + tree.find(11));
        // System.out.println("Find " + 7 + ": " + tree.find(7));
        // System.out.println("Find " + 9 + ": " + tree.find(9));
        // System.out.println("Find " + 10 + ": " + tree.find(10));
        // System.out.println("Find " + 15 + ": " + tree.find(15));

        // System.out.println("Insert 15");
        // tree.insert(15);
        // System.out.println("Find " + 15 + ": " + tree.find(15));
    }

    public static int factorial(int number) {
        return (number == 0) ? 1 : number * factorial(number - 1);

        // var factorial = 1;
        // for (int i = number; i > 1; i--)
        // factorial *= i;
        // return factorial;
    }
}
