package org.example.Fibonacci;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("indexul elemtului din sirul fibo");
        int n = scanner.nextInt();
        if(n<0){
            System.out.println("imput invalid ");
        }else{
            System.out.println("Al n-lea nuamr "+ n +"din sirul fibonacii este "+getFibonacii(n));
        }

    }

    private static int getFibonacii(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int a = 1;
        int b = 1;
        for (int i = 0; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;

        }
return b;
    }
}
