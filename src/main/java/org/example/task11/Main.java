package org.example.task11;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static final String stop ="Enough!";
    //final = Resursa IMUTABILA
// imutabile :LISTS, SETS, MAPS
    //DEFINIREA UNEI CONSTANTE INTERVIU :  public static final

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("textele sunt:");
        String urm=scanner.next();

        String pre="";
        while(!Objects.equals(urm, stop)) { //HAPPY FLOWS
            if (pre.length() < urm.length()) {
                pre = urm;
            }

            urm = scanner.next();
        }

        if(!pre.isEmpty()) //EDGE CASES
        {
            System.out.println("cuvatul este "+ pre);}
        else {
            System.out.println("E gol");
        }
    }
}
