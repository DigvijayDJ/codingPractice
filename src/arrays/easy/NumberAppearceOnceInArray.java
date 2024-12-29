package arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class NumberAppearceOnceInArray {
    public static void main(String[] args){
        int[] array = {1,1,2,3,3,4,4};
        System.out.println("Number that appearce once in array[Brute Force Solution] : "+ findNumberAppearceOnceBrute(array));
        System.out.println("Number that appearce once in array[Optimum Solution] : "+ findNumberAppearOnceOpt(array));

    }

    public static int findNumberAppearceOnceBrute(int[] arr){
        int count = 0;
        int num = -1;
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                num = arr[i];
                break;
            }
            else {
                count = 0;
            }
        }
        return num;
    }

    public static int findNumberAppearOnceOpt(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for (int key : map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }
        return -1;
    }

    /*
    Note: to search a list of elements that appeared once or a specific times or max,
    HashMap is a better way to check.

    We can also use XOR to find, it is faster than a hashMap.

    */

}
