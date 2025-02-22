package org.example.Primalitate;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numarul este:");
        int n = scanner.nextInt();

//sortarea ,cautare binara, algoritmi

        //Algoritm de primalitate
        int i;
        if (n > 0) {
            for (i = 2; i <= n; i++) {
                boolean v = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        v = false;
                    }

                }
                if (v) {
                    System.out.println(i);
                }
            }

        } else {
            System.out.println("Eronat");
        }
    }
}