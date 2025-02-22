package org.example.task2;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("introdu valorile");
        float greutate=scanner.nextFloat();
        int inaltime=scanner.nextInt();
        float inaltime2=inaltime/100.0f;


        double BMI=greutate/Math.pow(inaltime2,2);
        if(BMI>=18.5 && BMI<=24.9)
        {
            System.out.println("optim");
        }
        else
        {
            System.out.println("nu e optim");
        }

    }
}
