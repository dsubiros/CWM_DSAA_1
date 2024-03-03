package com.codewithmosh;

import com.codewithmosh.classes.BinaryTree4;

public class BinaryTreeSection4 {
    public static void main(String[] args) {
        // example1();

        find1();
    }

    public static void find1() {
        // yes, no, no, yes, no, yes, yes
        var values = new int[] { 1, 5, 110, 8, 129, 10, 7 };
        var tree = populateTree4(new int[] { 7, 4, 9, 1, 6, 8, 10 });

        var found = false;

        for (int i : values) {
            found = tree.find(i);
            System.out.println("Value \"" + i + "\" was found: " + (found == true ? "yes" : "no"));
        }
    }

    public static void example1() {
        var tree = populateTree4(new int[] { 7, 4, 9, 1, 6, 8, 10 });
        System.out.println(tree);
    }

    public static BinaryTree4 populateTree4(int[] values) {
        var tree = new BinaryTree4();

        for (int i : values) {
            tree.insert(i);
        }

        return tree;
    }
}
