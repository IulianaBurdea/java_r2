package org.example.task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numarul este:");
        int n = scanner.nextInt();

        double sum=0;
        for(int i=1; i<=n ;i++)
        {
            sum=sum+1.0/i; //1/1+1/2+..1/n=sum
        }
        System.out.println(sum);
    }
}
