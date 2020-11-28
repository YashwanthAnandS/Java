package com.yash.Recursion;

import java.util.Scanner;

//Time Complexity is O(N)
public class FactorialNumber {
    //N!=N * (N-1) * (N-2) ...... 2 * 1
    //5!=5*4*3*2*1
    public static int Factorial(int N){
        if(N<=1){
            return 1;
        }else{
            return (N* Factorial(N-1));
        }
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=in.nextInt();
        System.out.println("Factorial of "+num+" is "+Factorial(num));
    }
}
