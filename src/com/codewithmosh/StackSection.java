package com.codewithmosh;

import java.util.Stack;

import com.codewithmosh.classes.MyExpression;
import com.codewithmosh.classes.MyStack;

public class StackSection {
    public static void main(String[] args) {
        // checkForBalancedExpression();

        var stack = new MyStack();
        System.out.println(stack);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        stack.pop();
        // System.out.println(stack);
        System.out.println(stack);
        
        System.out.println("Peek: " + stack.peek());

    }

    private static void checkForBalancedExpression() {
        System.out.println("Check for balanced Expression!");

        var stack1 = new MyExpression();
        
        var str = "(1 + 2)";
        System.out.println(str + " is balanced: " + stack1.isStringBalanced(str));

        str = "(20 + (7))";
        System.out.println(str + " is balanced: " + stack1.isStringBalanced(str));

        str = "(<20 + (7))";
        System.out.println(str + " is balanced: " + stack1.isStringBalanced(str));

        str = "(<20> + <<(7)>>)";
        System.out.println(str + " is balanced: " + stack1.isStringBalanced(str));
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
