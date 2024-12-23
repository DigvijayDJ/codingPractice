package maths;

import java.util.Scanner;

public class Swap2Num {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        swapNumbers(num1,num2);
    }

    public static void swapNumbers(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("swaped a : "+a+" b : "+b);
    }
}
