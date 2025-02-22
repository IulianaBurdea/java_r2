package org.example.CuvantDuplicat;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/* INTERVIU
oop
principiile oop
keywords- modificatori de acces, static, final,return,break,new
supraincare/ suprascriere
spune un princpiu si defineste -abstractizar, incapsulare, simple dar mostenire + polimorfism MAI SPECTACULOS  !!!, relatia dintre ele toate 4
fluente unaa dupa alta

supraincarcarea =este procesulde reutilizare a denumirii unei metode cu semnaturi diferite ,
 se poate intalni la nivel de clasa

SUPRASCRIEREA = este procedeul de a redefini
 */
/**
 * suprascrierea = este procedeul de a redefini implementarea unei metode intr-o relatie de mostenire intre clase
 * - clasa copil mosteneste o metoda pe care o redefineste dupa bunul plac fiind usor diferita fata de cea din clasa
 * parinte
 * - metodele de acest tip sunt marcate de anotatia @Override
 *
 * supraincarcarea = este procedeul de reutilizare a denumirii unei metode cu semnaturi diferite
 * - se poate intalni la nivel de clasa
 * */

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Introduceti textul");
        String rand=scanner.nextLine();

        //split -> strtok

        String[] words1=rand.split(" "); //vector de cuvinte?
        List<String> words2=new ArrayList<>(List.of(words1));//list mai importante INTERVIU

        StringBuilder stutterdText=new StringBuilder(); //manipuleaza stringurile
        for(String it:words2){
            //apelare continua, recursiva
            stutterdText
                    .append(it)
                    .append(" ")
                    .append(it)
                    .append(" ");
        }
        System.out.println("text cu fiecare cuvant dublat\n "+ stutterdText);

    }
}
