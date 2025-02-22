package org.example.SumaCifrelor;

import java.util.Scanner;

//Ce e o conditie de avansare?
//O conditie de avansare intr o instructiune repritiva este cea care asigura evitarea unei bucle infinite
//for- > i+++
//while -> ultima instr din blocul de cod



public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Numarul este:");
        int numar=scanner.nextInt();
      if(numar<=0)
      {
          System.out.println("Numar invalid");
          return; //similar lui break !!
      }
      else {
          System.out.println("Suma este "+ getSum(numar));

      }
    }

    private static int getSum(int n) {

            int s=0;
            while(n!=0)
            {
                s=s+n%10;
                n/=10;
            }
            return s;
    }
}
