package algorithmBasic;

import java.util.Scanner;

public class AlgorithmBasic22 {

    public static void main(String[] args) {

        /**
         * 문제명: 배열에서 짝수와 홀수 개수 및 합 구하기
         *
         * 정수 N을 입력받고, 이어서 N개의 정수를 배열에 저장한 뒤,
         * 배열 안에서 짝수와 홀수의 개수와 합계를 각각 구하여 출력하는 프로그램을 작성
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

        int evenSum = 0;
        int evenCount = 0;

        int oddSum = 0;
        int oddCount = 0;

        // 배열에 값 입력
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                evenCount++;
                evenSum += arr[i];
            }else{
                oddCount++;
                oddSum += arr[i];
            }
        }

        // 최종 결과 출력
        System.out.println("짝수의 개수 : " + evenCount);
        System.out.println("짝수의 합계 : " + evenSum);

        System.out.println("홀수의 개수 : " + oddCount);
        System.out.println("홀수의 합계 : " + oddSum);


    }
}
