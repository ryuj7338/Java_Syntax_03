package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       String[] dice = sc.nextLine().split(" ");
       int a = Integer.parseInt(dice[0]);
       int b = Integer.parseInt(dice[1]);
       int c = Integer.parseInt(dice[2]);

       if (a == b && b == c) {
           System.out.println(10000 + a * 1000);
       }
       else if ( a == b && b != c || a != b && a == c) {
           System.out.println(1000 + a * 100);
       }else if (a != b && b == c) {
           System.out.println(1000 + b * 100);
       }else if (a != b && b != c) {
           if (a > b && a > c) {
               System.out.println(a * 100);
           }
           if (a < b && b > c) {
               System.out.println(b * 100);
           }
           if (a < c && b < c) {
               System.out.println(c * 100);
           }

       }

    }
}