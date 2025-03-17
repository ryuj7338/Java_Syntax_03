package org.example;


import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            Scanner sc= new Scanner(System.in);   // 입력

            double A, B;   // int타입 A,B 선언
            A = sc.nextDouble();   // A = 1
            B = sc.nextDouble();   // B = 3

//            float A, B;
//            A = sc.nextFloat();
//            B = sc.nextFloat();     // 출력 값 :0.33333334


            System.out.println(A / B); //출력 : 0.33333333333333333333333333333333
        }
    }














