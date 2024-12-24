package maths;

public class NeonInN {
    public static void main(String[] args){
        int a = 1, b= 1000;
        checkNeon(a,b);
    }

    public static void checkNeon(int l, int h){

        for(int i = l; i<=h; i++){
            int sqr = i*i;
            int sumNum = 0;
            while (sqr > 0){
                sumNum += sqr % 10;
                sqr = sqr/10;
            }
            if(sumNum == i){
                System.out.println("Neon number : " + i);
            }
        }
    }
}
