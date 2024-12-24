package patterns;

public class Arrows {
    public static void main(String[] args){
        pattern(4);
    }
    public static void pattern(int n){
        for(int row = 1; row<2*n; row++){
            int printCol = row > n ? 2*n-row : row;
            for(int col = 1; col<=printCol; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


//    public static void pattern10(int n){
//        for(int row = 0; row<2*n-1; row++){
//            for(int col = 0; col<2*n-1; col++){
//                if(row == 0 || col == 0 || row == 2*n-2){
//                    System.out.print(n+" ");
//                }
//            }
//            System.out.println();
//        }
//    }
}
