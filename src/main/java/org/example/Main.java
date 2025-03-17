package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);   // 입력

       int A = sc.nextInt();    // 5
       int B = sc.nextInt();    // 8
       int C = sc.nextInt();    // 4


        System.out.println((A+B)%C);
        System.out.println( ((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C) * (B%C))%C);
    }
}














