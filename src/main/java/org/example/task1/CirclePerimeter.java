package org.example.task1;

import java.util.Scanner;

/*
Write an application that will read diameter of a circle (variable of type float) and calculate perimeter
 of given circle. Firstly, assume π = 3.14. Later, use value of π from built-in Math class
 psvm->main
 */
public class CirclePerimeter {
    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
        System.out.println("Introdu valoarea:");
        float diametru=scanner.nextFloat();
        final float piC=3.14f; // variabila constanta
        System.out.println(diametru*piC);
        System.out.println(diametru*Math.PI);

    }

}
