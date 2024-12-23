package maths;

import java.util.Scanner;

public class AddBinaryStrings {
    static String addBinary(String s1, String s2){
        int n1 = Integer.parseInt(s1, 2);
        int n2 = Integer.parseInt(s2, 2);
        int sum = n1+n2;

        String res = Integer.toBinaryString(sum);
        return res;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        System.out.println(addBinary(s1,s2));
    }
}
