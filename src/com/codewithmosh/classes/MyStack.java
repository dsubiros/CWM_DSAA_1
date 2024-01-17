package com.codewithmosh.classes;

import java.util.Stack;

public class MyStack {
    public String reverseString(String input) {

        if (input == null)
            throw new IllegalArgumentException();

        var stack = new Stack<Character>();

        for (char ch : input.toCharArray())
            stack.push(ch);

        var result = new StringBuffer();

        while (!stack.isEmpty())
            result.append(stack.pop());

        return result.toString();
    }
}
