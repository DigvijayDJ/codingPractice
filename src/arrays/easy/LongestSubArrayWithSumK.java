package arrays.easy;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 1, 1, 1, 2, 3};
        int k1 = 6;
        System.out.println("Longest Subarray Length (Optimal): " + longestSubarrayOptimal1(arr1, k1));

        int[] arr2 = {3, -1, 4, -2, 5};
        int k2 = 6;
        System.out.println("Longest Subarray Length: " + longestSubarrayOptimal2(arr2, k2));

        int[] arr = {3, 0, 4, 1, 5};
        int k = 6;
        System.out.println("Longest Subarray Length (Two Pointer): " + longestSubarrayin0orPositiveArrayOptimal(arr, k));

    }

    public static int longestSubarrayOptimal1(int[] arr, int k){
        Map<Integer, Integer> sumMap = new HashMap<>();
        int maxLength = 0, cumulativeSum = 0;
        for(int i = 0; i<arr.length; i++){
            cumulativeSum += arr[i];

            if(cumulativeSum == k){
                maxLength = i+1;
            }

            if(sumMap.containsKey(cumulativeSum-k)){
                maxLength = Math.max(maxLength, i-sumMap.get(cumulativeSum-k));
            }
            sumMap.putIfAbsent(cumulativeSum, i);
        }
        return maxLength;
    }

    public static int longestSubarrayOptimal2(int[] arr, int k){
        Map<Integer, Integer> sumMap = new HashMap<>();
        int maxLength = 0;
        int cumulativeSum = 0;
        for (int i = 0; i<arr.length; i++){
            cumulativeSum += arr[i];
            if(cumulativeSum == k){
                maxLength = i+1;
            }

            if(sumMap.containsKey(cumulativeSum-k)){
                maxLength = Math.max(maxLength, i - sumMap.get(cumulativeSum-k));
            }
            sumMap.putIfAbsent(cumulativeSum, i);
        }
        return maxLength;
    }

    public static int longestSubarrayin0orPositiveArrayOptimal(int[] arr, int k){
        int maxLength = 0;
        int start = 0;
        int currentSum = 0;
        for(int end = 0; end<arr.length; end++){
            currentSum += arr[end];

            while (start <= end && currentSum > k){
                currentSum -= arr[start];
                start++;
            }
            if(currentSum == k){
                maxLength = Math.max(maxLength, end - start +1);
            }
        }
        return maxLength;
    }

    /* Note : 2 pointer approach is best when array is non negative, else first go for hashmap approach.
    for Hashmap :
        Optimal Approach (Using HashMap)
	•	Algorithm:
	    •	Use a HashMap to store the cumulative sum at each index.
	    •	For each index, calculate the cumulative sum:
	1.	If the cumulative sum equals  k , update the maximum length.
	2.	Check if  (cumulative sum - k)  exists in the HashMap:
	    •	If yes, it means there exists a subarray with a sum equal to  k .
	    •	Update the maximum length.
	3.	Store the cumulative sum in the HashMap if it’s not already present (to maintain the earliest occurrence).

    for 2 Pointer approach :
        Algorithm
	    •	Initialize:
	    •	 \text{start} = 0 ,  \text{end} = 0 ,  \text{currentSum} = 0 ,  \text{maxLength} = 0 .
	    •	Expand  \text{end}  and add  arr[\text{end}]  to  \text{currentSum} .
	    •	While  \text{currentSum} > k , shrink the window by moving  \text{start}  forward and subtracting  arr[\text{start}] .
	    •	If  \text{currentSum} == k , update  \text{maxLength}  as the maximum of its current value and  (\text{end} - \text{start} + 1) .
	    •	Repeat until  \text{end}  traverses the entire array.

    */
}
