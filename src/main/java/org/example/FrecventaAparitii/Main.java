package org.example.FrecventaAparitii;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Introduceti text" );
    String input=scanner.nextLine();
    if(input.isEmpty())
    {
        System.out.println("gol");
        return;
    }

        System.out.println("procentaj"+calcul(input));

    }

    private static double calcul(String input) {
        int k=0;
        for(int i=0;i<input.length();i++) {
            if (input.charAt(i) == ' ') //INTERVIU frecventa
                k++;
        }

        return (double)k/input.length()*100;
    }
}
