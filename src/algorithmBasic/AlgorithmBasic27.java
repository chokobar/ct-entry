package algorithmBasic;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmBasic27 {
    public static void main(String[] args) {

        /**
         * 문제명: 배열 요소 뒤집어 출력하기
         *
         * 정수 N을 입력받고, 이어서 N개의 정수를 배열에 저장한 뒤,
         * 저장된 배열의 값을 거꾸로 출력하는 프로그램을 작성
         *
         * 요구사항
         * 반드시 배열을 사용하여 입력값을 저장할 것.
         * for문을 사용하여 배열을 역순으로 탐색할 것.
         *
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("N 입력: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i--) {
            arr[i]  = sc.nextInt() ;
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
