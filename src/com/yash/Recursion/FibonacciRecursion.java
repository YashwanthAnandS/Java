package com.yash.Recursion;

import java.util.Scanner;

//Time Complexity: O(2^N)
public class FibonacciRecursion {
    public static int Fibonacci(int N) {
        if (N == 0) {
            return 0;
        } else if (N == 1) {
            return 1;
        } else {
            return Fibonacci(N - 1) + Fibonacci(N - 2);
        }
    }


    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(Fibonacci(i));
        }
    }
}