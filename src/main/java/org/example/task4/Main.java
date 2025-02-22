package org.example.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numarul este:");
        int numar = scanner.nextInt();
        if (numar > 0) {
            for (int i = 1; i < numar; i++) {
                if (i % 3 == 0 && i % 7 == 0) {
                    System.out.println(" Fizz Buzz ");
                } else if (i % 3 == 0) {
                    System.out.println(" Fizz ");
                } else if (i % 7 == 0) {
                    System.out.println(" Buzz ");
                } else {
                    System.out.println(i + "  ");
                }
            }
        } else {
            System.out.println("n<0");
        }
    }
}
