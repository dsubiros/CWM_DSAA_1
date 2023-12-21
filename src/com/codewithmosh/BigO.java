package com.codewithmosh;

public class BigO {

    public static void main(String[] args) throws Exception {
        System.out.println("\nHello, World!");

    }

    public void log1(int[] numbers) {
        // O(1)
        System.out.println(numbers[0]);

        // O(n)
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // O(n)
        for (int number : numbers) {
            System.out.println(number);
        }

        // O(n)
        System.out.println(); // O(1)
        for (int number : numbers) // O(n)
            System.out.println(number);
        // O(1)
        System.out.println();

        // O(n)
        for (int number : numbers) // O(n)
            System.out.println(number);

        for (int number : numbers) // O(n)
            System.out.println(number);

    }

    public void log2(int[] numbers, String[] names) {
        // 0(n + m) = 0(n)
        for (int number : numbers) // O(n)
            System.out.println(number);

        for (String name : names) // O(m)
            System.out.println(name);

    }

    public void log3(int[] numbers) {
        // O(n + n^2) = (n^2)
        for (int number : numbers) // O(n)
            System.out.println(number);

        for (int first : numbers) // O(n)
            for (int second : numbers) // O(n)
                System.out.println(first + " " + second);

    }

    public void log4(int[] numbers) {
        // O(n^3)
        for (int first : numbers) // O(n)
            for (int second : numbers) // O(n)
                for (int third : numbers) // O(n)
                    System.out.println(first + " " + second + " " + third);

    }

    public void greet1(String[] names) {
        // O(n) space

        String[] copy = new String[names.length];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Hi " + names[i]);
            
        }
    }
}
