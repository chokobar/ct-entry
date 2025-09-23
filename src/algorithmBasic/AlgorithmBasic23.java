package algorithmBasic;

import java.util.Scanner;

public class AlgorithmBasic23 {

    public static void main(String[] args) {

        /**
         * 문제명: 배열에서 최댓값과 최솟값 찾기
         *
         * 정수 N을 입력받고, 이어서 N개의 정수를 배열에 저장한 뒤,
         * 배열 안에서 최댓값과 최솟값, 그리고 그 값이 위치한 **인덱스(위치)**를 출력하는 프로그램을 작성하세요.
         *
         *
         * 요구사항
         * 반드시 배열을 사용하여 입력값을 저장할 것.
         * for문을 사용하여 최댓값과 최솟값을 찾을 것.
         * 최댓값 또는 최솟값이 여러 개라면 가장 앞쪽 인덱스를 출력할 것.
         *
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("N 입력: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        int maxNum = arr[0];
        int maxIndex = 0;

        int minNum = arr[0];
        int minIndex = 0;

        // 배열에 값 입력
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] > maxNum) {
                maxNum = arr[i];
                maxIndex = i;
            }

            if(arr[i] < minNum) {
                minNum = arr[i];
                minIndex = i;
            }
        }

        // 최종 결과 출력
        System.out.println("최대 값 : " + maxNum);
        System.out.println("최대 인덱스 : " + maxIndex);

        System.out.println("최소 값 : " + minNum);
        System.out.println("최소 인덱스 : " + minIndex);

    }
}
