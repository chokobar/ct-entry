package algorithmBasic;

import java.util.Scanner;

public class AlgorithmBasic24 {

    public static void main(String[] args) {

        /**
         * 문제명: 배열에서 두 번째 큰 값 찾기
         *
         * 정수 N을 입력받고, 이어서 N개의 정수를 배열에 저장한 뒤,
         * 배열 안에서 두 번째로 큰 값(2등 값)을 찾아 출력하세요.
         *
         *
         * 요구사항
         * 반드시 배열을 사용하여 입력값을 저장할 것.
         * 최댓값을 먼저 구한 뒤, 그 최댓값보다 작은 값 중에서 가장 큰 값을 찾아야 함.
         * 최댓값이 여러 개 있어도 두 번째 큰 값은 그보다 작은 수 중 가장 큰 값으로 판단.
         *
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("N 입력: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;


        // 배열에 값 입력
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }

        System.out.println("두 번째 큰 값: " + secondMax);

    }
}
