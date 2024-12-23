package maths;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    public static void main(String[] args){
        int n = 100;
        int flag;
        List<Integer> pList = new ArrayList<>();

//      Brute Force approach
        for(int i = 2; i<=n ; i++){
            flag = 1;
            for(int j = 2; j<=i/2; j++){
                if(i%j == 0){
                    flag = 0;
                    break;
                }
            }
            if(flag == 1){
                pList.add(i);
            }
        }
        System.out.println("List of primes is : "+pList);
    }

//    or smart approach [check upto squareRoot only instead of n/2]

}
