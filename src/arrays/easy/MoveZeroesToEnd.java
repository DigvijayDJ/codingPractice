package arrays.easy;

public class MoveZeroesToEnd {
    public static void main(String[] args){
        int[] arr = {1,2,0,1,0,0,6,2,0,0};
        int len = arr.length;
        bruteApproach(arr, len);
        System.out.println();
        optApproach(arr, len);
    }
    public static void bruteApproach(int[] arr, int len){
        int[] temp = new int[len];
        int j = 0;
        for(int i=0; i<len; i++){
            if(arr[i] != 0){
                temp[j] = arr[i];
                j++;
            }
        }

        for(int i = 0; i<len; i++){
            if(i<j){
                arr[i] = temp[i];
            }
            else {
                arr[i] = 0;
            }
        }

        System.out.println("bruteApproach Result : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }

    public static void optApproach(int[] arr, int len){
        int j = -1;
        for (int i=0;i<len;i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }

        for(int i=j+1;i<len;i++){
            if(arr[i] != 0){
                swap(arr[i],arr[j]);
                j++;
            }
        }
        System.out.println("optApproach Result : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
