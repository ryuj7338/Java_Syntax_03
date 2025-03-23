package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] numbers = sc.nextLine().split(" ");

        int A = Integer.parseInt(numbers[0]);
        int B = Integer.parseInt(numbers[1]);

//        int A, B;
//
//        A = sc.nextInt();
//        B = sc.nextInt();

        if (A > B) {
            System.out.print(">");
        }else if (A < B) {
            System.out.print("<");
        }else if (A == B) {
            System.out.print("==");
        }

    }
}














