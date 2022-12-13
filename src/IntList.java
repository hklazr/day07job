package day07.src;

import java.security.SecureRandom;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class IntList {

    public static void main(String[] args) {
        
        Integer max = 100;
        Integer range = 100;
        Random rnd = new SecureRandom();

        List<Integer> numList = new LinkedList<> ();
        for (Integer i = 0; i < max; i++)
        numList.add(rnd.nextInt(range));
        
        System.out.println(">>> numList:" + numList); 

        filter(numList);
    }
        public static void filter(List<Integer> numList) {
            
        System.out.println("<------FIlter----->");
        // Filter
        List<Integer> resultList = new LinkedList<>();
        for (Integer n : numList) {
            if (0 == (n % 3))
            continue;
            resultList.add(n);
        }
        System.out.println(">>> resultLIst:" + resultList);
            
        resultList  = numList.stream()
        // Predicate: boolean test(Integer i)
        
            .filter((n) -> 0 == (n % 3))
            .sorted()
            .limit(5)
            .toList() ;
            System.out.println(">>> Stream resultLIst:" + resultList);
            }
    }
    


