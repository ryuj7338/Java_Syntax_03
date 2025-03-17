package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);   // 입력

        String[] num = sc.nextLine().split(" ");

        long A = Long.parseLong(num[0]);
        long B = Long.parseLong(num[1]);
        long C = Long.parseLong(num[2]);

        System.out.println(C +B+C);

//        Scanner sc = new Scanner(System.in);
//
//        long A, B, C;
//
//        A = sc.nextLong();
//        B = sc.nextLong();
//        C = sc.nextLong();
//
//
//        System.out.println(A+B+C);
    }
}














