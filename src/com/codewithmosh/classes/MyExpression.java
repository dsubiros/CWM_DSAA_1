package com.codewithmosh.classes;

import java.util.HashMap;
import java.util.Stack;

public class MyExpression {
    private HashMap<Character, Character> map;

    public MyExpression() {
        map = new HashMap<Character, Character>();
        map.put(')', '(');
        map.put(']', '[');        
        map.put('}', '{');
        map.put('>', '<');
    }

    private Boolean isLeftBracket(Character c) {
        return map.containsValue(c); 
    }

    private Boolean isRightBracket(Character c) {
        return map.containsKey(c);
    }
    
    private Boolean bracketsMatch(Character left, Character right) {
        return left != map.get(right);
    }

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

    public Boolean isStringBalanced(String input) {

        if (input == null)
            throw new IllegalArgumentException();

        var stack = new Stack<Character>();

        for (char c : input.toCharArray()) {
            if (isLeftBracket(c))
                stack.push(c);

            else if (isRightBracket(c)) {
                if (stack.isEmpty())
                    return false;

                var top = stack.pop();
                if (bracketsMatch(top, c))
                    return false;
            }
        }

        return stack.isEmpty();
    }

}
