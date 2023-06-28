package com.pawan.kumar;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter a no");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
          //  System.out.println("Invalid no");
            throw new IllegalArgumentException("Invalid input");
        } else if (n % 2 == 0) {
            System.out.println("Even no");

        } else  {
            System.out.println("Odd no");
        }
    }
}
