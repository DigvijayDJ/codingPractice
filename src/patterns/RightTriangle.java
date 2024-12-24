package patterns;

public class RightTriangle {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("\n");
        }

        for(int i = 1; i<=n ; i++){
            for(int j = n; j>=i; j--){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
