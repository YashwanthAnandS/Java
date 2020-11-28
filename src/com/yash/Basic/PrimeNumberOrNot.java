package com.yash.Basic;

import java.util.Scanner;

public class PrimeNumberOrNot {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
       }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter the Number : ");
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        if(isPrime(num)){
            System.out.println(num+" is a Prime Number");
        }else{
            System.out.println(num+" is not a Prime Number");
        }

    }
}
