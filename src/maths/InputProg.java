package maths;

import jdk.internal.util.xml.impl.Input;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class InputProg {
    public static void main(String[] args){
        int n;
        System.out.println("Enter integer here :: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println("Entered number was :: "+n);
    }
}

