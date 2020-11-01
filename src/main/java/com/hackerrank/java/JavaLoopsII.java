package com.hackerrank.java;

import java.util.Scanner;

public class JavaLoopsII {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int buffer = a;
            for (int j = 0; j < n; j++) {
                buffer += (Math.pow(2, j) * b);
                System.out.print(buffer + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
