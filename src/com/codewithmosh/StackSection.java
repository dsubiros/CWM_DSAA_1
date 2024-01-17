package com.codewithmosh;

import java.util.Stack;

import com.codewithmosh.classes.MyStack;

public class StackSection {
    public static void main(String[] args) {
        System.out.println("Hello from Stacks!");

        // print1();

        var stack1 = new MyStack();
        // var result = stack1.reverseString("XYZ");
        var result = stack1.reverseString(null);
        System.out.println(result);

    }

    

    public static void print1() {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.toString());

        stack.pop();
        System.out.println(stack.toString());
    }

}
