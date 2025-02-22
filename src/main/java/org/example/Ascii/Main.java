package org.example.Ascii;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Primul Caracter");
        char c1=scanner.next().charAt(0);
        System.out.println("Al doilea Caracter");
        char c2=scanner.next().charAt(0);
        if(!Character.isLowerCase(c1) || !Character.isLowerCase(c2)){
            System.out.println("unul din caractere nu e litera mica");
            return;
        }
        int ascii1=(int)c1;// a-97
        int ascii2=(int)c2;
        int distanta=Math.abs(ascii1-ascii2)-1; //modul -5 =>5

        System.out.println(distanta + " este distanta");



    }
}
