package arrays;

public class RemoveDuplicatesInPlace {
    public static void main(String[] args){
        int[] array = {1,2,2,3,4,4,4,5,5,6,6,6,6,7,8,9};

        int i =0;
//        as array is sorted and have duplicates so we can use below logic.
        for(int j = 1; j<array.length; j++){
            if(array[j] != array[i]){
                array[i+1] = array[j];
                i++;
            }
        }
        System.out.println(i+1);
    }
}
