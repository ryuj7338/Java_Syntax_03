package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int arr[] = new int[T];

        for (int i = 1; i < T; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            arr[i -1] = a + b;
            System.out.println(arr[i-1]);
        }

    }
}