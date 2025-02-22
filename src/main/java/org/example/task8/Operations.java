package org.example.task8;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Primul numar este:");
        int n1 = scanner.nextInt();
        System.out.println("Simbolul:");
        char symbols = scanner.next().charAt(0);
        System.out.println("Al doilea numar");
        int n2 = scanner.nextInt();
        Calculator c = new Calculator();
        switch (symbols) {
            case '+':
                System.out.println(c.adunare(n1, n2));
                break;
            case '*':
                System.out.println(c.inmultire(n1, n2));
                break;
            case '/':
                if(n2==0) {
                    System.out.println("Nu se poate face impartirea");
                }else {
                System.out.println(c.impartire(n1, n2));
                break;}
            case '-':
                System.out.println(c.scadere(n1,n2));
                break;
            default:
                System.out.println("SIMBOL INVALID");
        }
    }
}
