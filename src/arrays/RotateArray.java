package arrays;

public class RotateArray {
    public static void main(String[] args){
        int[] arr = {1,2,0,1,0,1,6,2,1,0};
        int d = 15;
        bruteApproach(arr, arr.length, d);
        System.out.println();
        optApproach(arr, arr.length, d);
        System.out.println();
        rightRotaion(arr, arr.length, d);
    }

    public static void bruteApproach(int[] arr, int n, int d){
        int rotateN = d%n;
        int[] temp = new int[n];
        int j = 0;
        for(int i = rotateN; i<n; i++){
            temp[j] = arr[i];
            j++;
        }
        for(int i = 0; i<rotateN; i++){
            temp[j] = arr[i];
            j++;
        }
        System.out.println("bruteApproach Result : ");
        for (int i : temp) {
            System.out.print(i+" ");
        }
    }

    public static void optApproach(int[] arr, int n, int d){
//        while rotating array left wards what we can check , if we devide array into two halves by roation number,
//        then reverse these 2 sub parts of array, then reverse the whole array, we will get dezired output.
        int rotateN = d%n;
        reverse(arr, 0, rotateN-1);
        reverse(arr, rotateN, n-1);
        reverse(arr, 0, n-1);

        System.out.println("optApproach Result : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }

    public static void rightRotaion(int[] arr, int n, int d){
//        To rotate left by d, we need to reverse second half first, then first half, then complete array.

        int rotateN = d%n;
        reverse(arr, n-rotateN, n-1);
        reverse(arr, 0, n-rotateN-1);
        reverse(arr, 0, n-1);

        System.out.println("optApproach Result Right Rotate: ");
        for (int i = 0; i<n; i++) {
            System.out.print(i+" ");
        }
    }

    public static void reverse(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
