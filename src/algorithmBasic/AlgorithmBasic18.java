package algorithmBasic;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmBasic18 {

    public static void main(String[] args) {

        /**
         * 문제명: 배열 합계 구하기
         *
         * 정수 N을 입력받고, 이어서 N개의 정수를 배열에 저장한 뒤,
         * 배열에 들어있는 값들의 합계를 구해서 출력하는 프로그램을 작성하세요.
         *
         * 요구사항
         * 반드시 배열에 저장한 뒤 출력할 것.
         * for문을 사용하여 배열을 역순으로 탐색할 것.
         *
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("N 입력: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        int sum = 0;

        // 배열에 값 입력
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

    }
}
