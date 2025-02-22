package org.example.Primalitate;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numarul este:");
        int n = scanner.nextInt();

        for (int numar = 0; numar <= n; numar++) {
            boolean prim = true;
            if (numar == 0 || numar == 1) {
                prim = false;
            } else if (numar % 2 == 0 && numar != 2) {
                prim = false;
            }
            for (int i = 3; i <= Math.sqrt(numar); i = i + 2) {
                if (numar % i == 0)
                    prim = false;
            }
            if (prim == true)
                System.out.println("numarul prim este:" + numar);

        }
    }
}
