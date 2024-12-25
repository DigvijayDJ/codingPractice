package arrays;

public class SecondsInArray {
    public static void main(String[] args) {
        int[] array = {10, 3, 2, 9, 11, 232, 43, 56, 98, 10, 22, 43, 5};
        int sLargest = secondLargest(array);
        int sSmallest = secondSmallest(array);
        System.out.println(" Second Smallest value : "+sSmallest+" Second LargestValue : "+sLargest);
    }

    public static int secondLargest(int[] a){
        int largest = a[0];
        int sLargest = -1;
        for(int i = 1; i<a.length; i++){
            if(a[i]>largest){
                sLargest = largest;
                largest = a[i];
            }
            else if (a[i] < largest && a[i]>sLargest){
                sLargest = a[i];
            }
        }
        return sLargest;
    }

    public static int secondSmallest(int[] a){
        int smallest = a[0];
        int sSmallest = Integer.MAX_VALUE;
        for(int i=1;i<a.length; i++){
            if(a[i] < smallest){
                sSmallest = smallest;
                smallest = a[i];
            } else if (a[i] > smallest && a[i] < sSmallest ) {
                sSmallest = a[i];
            }
        }
        return sSmallest;
    }
}
