package org.example.FrecventaNume;
import java.util.*;

public class Main {
    public static void main(String[] args) {
Scanner scanner=new Scanner(System.in);
List<Integer> duplicateNumbers =new ArrayList<>();
        System.out.println("Introduceti 10 nr");
        for(int i=0; i<10; i++){
            duplicateNumbers.add(scanner.nextInt());

        }
        //calcularea frecventei folosind map
        Map<Integer,Integer> freqOfNumbers=new HashMap<>();
        //Map permite stocarea perechea , primul element =key
        //key-unic value-arbitrat
        /*
        pt KEY=>integer, maxim string
        pt VALUE=> orice tip de date
        Map=(1,3),(2,2),(3,2)
        1-key 3 -value
        2- key 2-value
         */
        //10 10 10 10 2 2 2 9 9 9
        for(Integer it:duplicateNumbers){
            //todo
            if(freqOfNumbers.containsKey(it)) {
                freqOfNumbers.put(it, freqOfNumbers.get(it) + 1); // 10,4
            }else
            {
                freqOfNumbers.put(it,1); //prima aparitie
            }
        }

List<Integer> onlyDuplicate=new ArrayList<>();
        for(Map.Entry<Integer,Integer> it: freqOfNumbers.entrySet()){
            if(it.getValue()>1)
                System.out.println(it.getKey()+" ");
        }

    }
}
