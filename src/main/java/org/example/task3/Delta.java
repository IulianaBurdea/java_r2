package org.example.task3;

import java.util.Scanner;

public class Delta {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introdu valorile ecuatiei");
        System.out.println("Coeficient x^2");
        int a=scanner.nextInt();
        System.out.println("Coeficient x");
        int b=scanner.nextInt();
        System.out.println("Coeficient termen liber");
        int c=scanner.nextInt();
        double delta =Math.pow(b,2)-4*a*c;
        if(delta<0)
        {
            System.out.println("rezultat negativ");
        }else
        if(delta==0)
        { double x1=(-b+Math.sqrt(delta))/2*a;
            System.out.println("x1/2="+x1);
        }
        else{
            System.out.println("rezultat pozitiv");
            double x1=(-b+Math.sqrt(delta))/2*a;
            double x2=(-b-Math.sqrt(delta))/2*a;
            System.out.println("x1 este:"+x1+" x2 este: "+x2);
        }
    }

}
