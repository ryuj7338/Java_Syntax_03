package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);   // 입력

       int A = sc.nextInt();    // 472
       int B = sc.nextInt();    // 385

        // % - 나머지
        // / - 몫
        System.out.println(A *(B%10));  // B%10한 이유? 1의 자리수를 얻기 위해
        System.out.println(A *((B%100)/10));    // 1. B%100한 이유? 10의 자리수 얻기위해 2. ((B%10)/10)한 이유? 10의 자리수 중에 1의 자리를 제외하기 위해서
        System.out.println(A * (B/100));    // B/100한 이유? 100의 자리수를 얻기 위해
        System.out.println(A * B);
    }
}














