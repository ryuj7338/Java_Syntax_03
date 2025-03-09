package org.example;



public class Main {
    public static void main(String[] args) {

        //        int rows = 4;
        //
        //        for (int i = 1; i <= rows; i++) { // i는 row가 4니까 i는 1부터 4까지 4번 출력
        //            for (int k = 1; k <= i; k++) { // k도 i가 4까지 출력이니까 4번 출력
        //                System.out.print("* ");
        //            }   // k가 1일때 i도 1이므로 한 번 줄바꿈없이 출력후 i에 해당하는 for문으로 빠져나감.
        //            System.out.println();   // "*"넣으면 "*"추가되면서 줄바꿈됨.
        //        }   // i에 해당하는 for문은 줄바꿈하면서 출력


        int n = 3;      // 오직 정수로만 이루어져 있는 n이라는 변수에 3을 넣겠다.

        for(int i = 1; i <= n; i++) {   // 오직 정수로만 이루어져 있는 i라는 변수에 1을 넣겠다. i가 1씩 증가하면서 n(= 3)까지 반복문을 실행하겠다.
            for (int j = i; j < n; j++) {   // 오직 정수로만 이루어져 있는 j라는 변수에 i값을 넣겠다.
                System.out.print(" ");      // j가 n까지 즉, 3까지 도달할 때까지 " "를 반복한 후 j가 3이 되면 for문에서 빠져나가겠다.
            }
            for (int k = 1; k <= (2 * i -1); k++){  // 정수로만 이루어져 있는 k에 1을 넣겠다. k가 (2 * i -1)까지 1씩 증가하면서 반복문을 실행하겠다.
                System.out.print("*");      // k의 반복문이 실행될때 동안 "*"을 출력하겠다.
            }                   // k가 (2 * i -1)까지 도달하면 for문을 빠져나간다.
            System.out.println();       // j의 for문과 k의 for문이 다 실행되면 출력을 하겠다.
        }   // i의 for문이 다 실행되면 빠져나간다.

        for(int i = n -1 ; i >= 1; i--) {   // i라는 변수에 n - 1 (즉, 2)을 넣겠다. i가 1씩 감소하면서 1이 될 때까지 반복문을 실행하겠다.
            for (int k = n; k > i; k--) {   // k라는 변수에  n(즉, 3)을 넣겠다. k가 i(즉, 2)가 될 때까지 1씩 감소하면서 반복문을 실행하겠다.
                System.out.print(" ");      // k가 i가 될 때까지 " "을 출력하겠다.
            }   // k가 i가 되면 i 반복문을 빠져나간다.
            for (int k = 1; k <= (2 * i -1); k++){  // k라는 변수에 1을 넣겠다. k가 (2 * i - 1)까지 1씩 증가하면서 반복문을 실행하겠다.
                System.out.print("*");  // k가 (2 * i - 1)이 될 때까지 "*"를 출력하겠다.
            }   // k가 (2 * i - 1)이 되면 반복문을 빠져나간다.
            System.out.println();   //  i가 n -1이 될 때까지 출력을 하겠다.
        }   // i가 n - 1이 되면 반복문을 빠져나간다.
    }
}