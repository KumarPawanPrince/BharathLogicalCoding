package com.pawan.kumar;

import java.util.Scanner;

public class CreditScore {
    public static void main(String[] args) {
        System.out.println("Enter a Credit Score!");
        Scanner sc = new Scanner(System.in);
        int creditScore = sc.nextInt();
        if (creditScore < 400 || creditScore > 850) {
            System.out.println(" Invalid Credit score");
        } else if (creditScore > 400 && creditScore < 600) {
            System.out.println(" Silver credit score");

        } else if (creditScore > 600 && creditScore < 700) {
            System.out.println("Gold Credit Score");

        } else {
            System.out.println("Platinum Credit Score");
        }
    }
}
