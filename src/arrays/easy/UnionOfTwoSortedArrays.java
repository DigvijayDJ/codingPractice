package arrays.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        System.out.println("Union (Brute Force): " + unionBruteForce(arr1, arr2));
        System.out.println("Intersection (Brute Force): " + intersectionBruteForce(arr1, arr2));

        System.out.println("Union (Optimal): " + unionOptimal(arr1, arr2));
        System.out.println("Intersection (Optimal): " + intersectionOptimal(arr1, arr2));

        System.out.println("Union (Two Pointer): " + unionTwoPointer(arr1, arr2));
        System.out.println("Intersection (Two Pointer): " + intersectionTwoPointer(arr1, arr2));

    }

    public static List<Integer> unionBruteForce(int[] arr1, int[] arr2){
        List<Integer> result = new ArrayList<>();
        for (int num : arr1){
            if(!result.contains(num)) {
                result.add(num);
            }
        }
        for(int num : arr2){
            if(!result.contains(num)) {
                result.add(num);
            }
        }
        return result;
    }

    public static List<Integer> intersectionBruteForce(int[] arr1, int[] arr2){
        List<Integer> result = new ArrayList<>();
        for(int i : arr1){
            for (int j : arr2){
                if(i == j && !result.contains(i)){
                    result.add(i);
                }
            }
        }
        return result;
    }

    public static Set<Integer> unionOptimal(int[] arr1, int[] arr2){
        Set<Integer> result = new HashSet<>();
//      Use LinkedHashSet for insertion orders
        for(int num : arr1){
            result.add(num);
        }
        for(int num : arr2){
            result.add(num);
        }
        return result;
    }

    public static Set<Integer> intersectionOptimal(int[] arr1, int[] arr2){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for(int num : arr1){
            set1.add(num);
        }

        for (int num : arr2){
            if(set1.contains(num)){
                result.add(num);
            }
        }
        return result;
    }

    public static List<Integer> unionTwoPointer(int[] arr1, int[] arr2){
        List<Integer> result = new ArrayList<>();
        int i=0,j=0;
        while(i< arr1.length  && j< arr2.length){
            if(arr1[i] < arr2[j]){
                result.add(arr1[i]);
                i++;
            }
            else if(arr1[i] < arr2[j]){
                result.add(arr2[j]);
                j++;
            }
            else {
                result.add(arr1[i]);    // both are equal
                i++;
                j++;
            }
        }
        while (i<arr1.length){
            result.add(arr1[i]);
            i++;
        }
        while (j<arr2.length){
            result.add(arr2[j]);
            j++;
        }
        return result;
    }

    public static List<Integer> intersectionTwoPointer(int[] arr1, int[] arr2){
        List<Integer> result = new ArrayList<>();
        int i =0, j = 0;
        while (i< arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                i++;
            }
            else if(arr1[i] > arr2[j]){
                j++;
            }
            else {
                result.add(arr1[i]);
                i++;
                j++;
            }
        }
        return result;
    }
}
