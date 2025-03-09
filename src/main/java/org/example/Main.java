package org.example;

//1. arr1 변수에 [true, false, true] 연결
//2. arr2 변수에 [3.14, 7.77, 11.11] 연결
//3. arr3 변수에 [1~10] 연결
//- 객체 안에 데이터 넣기
//- 해당 객체가 가지고 있는 데이터 전부 출력
//- 3번은 반복문 사용
//- 자바 기본타입
//- 구글링, AI x


import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] arr1 = {"true, false, true"};

        System.out.println("arr1 : " +Arrays.toString(arr1));


        Float[] arr2 = {3.14f, 7.77f, 11.11f};

        System.out.println("arr2 : " +Arrays.toString(arr2));


        int[] arr3 = new int[10];

        for(int i = 1; i <= arr3.length; i++) {
            arr3[i-1] = i;
        }
        System.out.println("arr3 : " +Arrays.toString(arr3));



    }
}