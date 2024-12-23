package maths;

import jdk.internal.util.xml.impl.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputProg {
    public static void main(String[] args) throws IOException {
        int n;
        System.out.println("Enter integer here :: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        System.out.println("Entered number was :: "+n);

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String in = bf.readLine();
        System.out.println("Input string was : "+in);
    }
}

