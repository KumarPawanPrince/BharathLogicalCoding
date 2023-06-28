package com.pawan.kumar;

import java.util.Scanner;

public class DigitsInaNumber {
    public static void main(String[] args) {
        System.out.println("Enter a no");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int digit;
        while (n != 0) {
            digit = n % 10;
            System.out.print( digit + " ");
            n = n / 10;

        }
    }
}
