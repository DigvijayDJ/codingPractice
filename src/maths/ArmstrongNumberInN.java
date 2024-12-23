package maths;

public class ArmstrongNumberInN {
    public static void main(String[] args){
        int a = 100, b = 1000;
        armStrongNum(a, b);
    }
    public static void armStrongNum(int a, int b){
        for(int j = a+1; j<=b; j++) {
            int temp = j;
            int num = 0;
            while (temp > 0) {
                temp = temp / 10;
                num++;
            }
            int sumPower = 0;
            temp = j;
            while (temp != 0) {
                int d = temp % 10;
                sumPower += Math.pow(d, num);
                temp = temp / 10;
            }
            if(sumPower == j){
                System.out.println("ArmStrong Number : "+j);
            }
        }
    }
}