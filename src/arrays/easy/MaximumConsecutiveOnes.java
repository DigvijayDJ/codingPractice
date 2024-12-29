package arrays.easy;

public class MaximumConsecutiveOnes {
    public static void main(String[] args){
        int[] array = {1,1,1,0,0,0,1,1,1,1,1,0,1,1};
        System.out.println("Maximum Consecutive ones in array length : "+ findMaximumLengthOfConsecutive1s(array));
    }

    public static int findMaximumLengthOfConsecutive1s(int[] array){
        int count = 0;
        int maxLength = 0;

        for (int i = 0; i<array.length; i++){
            if(array[i] == 1){
                count ++;
                maxLength = Math.max(maxLength, count);
            }
            else {
                count = 0;
            }
        }
        return maxLength;
    }


}
