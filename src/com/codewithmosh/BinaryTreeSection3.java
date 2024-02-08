package com.codewithmosh;

import com.codewithmosh.classes.BinaryTree3;

public class BinaryTreeSection3 {
    public static void main(String[] args) {

        insert();
        
    }

    private static void insert() {
        var tree = populateTree(new int[]{7, 4, 1, 6, 9, 8, 10});
        System.out.println(tree);
    }

    private static BinaryTree3 populateTree(int[] values) {
        var tree = new BinaryTree3();

        for (int v : values)
            tree.insert(v);

        return tree;
    }
}
