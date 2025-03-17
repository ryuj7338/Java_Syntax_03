package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);   // 입력

       int A = sc.nextInt();    // 472
       int B = sc.nextInt();    // 385

        // % - 나머지
        // / - 몫
        System.out.println(A *(B%10));
        System.out.println(A *((B%100)/10));
        System.out.println(A * (B/100));
        System.out.println(A * B);
    }
}














