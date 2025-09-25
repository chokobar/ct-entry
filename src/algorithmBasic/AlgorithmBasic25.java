package algorithmBasic;

import java.util.Scanner;

public class AlgorithmBasic25 {
    public static void main(String[] args) {

        /**
         * 문제명: 배열의 평균보다 큰 값과 작은 값 찾기
         *
         * 정수 N을 입력받고, 이어서 N개의 정수를 배열에 저장한 뒤,
         * 배열 전체의 평균값을 구하고, 그 평균보다 큰 값들과 작은 값들을 각각 출력
         *
         *
         * 요구사항
         * 반드시 배열을 사용하여 입력값을 저장할 것.
         * 첫 번째 반복문에서는 배열에 입력받으면서 합계를 구해 평균을 계산할 것.
         * 두 번째 반복문에서는 평균보다 큰 값, 작은 값을 각각 출력할 것.
         * 평균과 같은 값은 출력하지 않는다.
         *
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("N 입력: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        int sum = 0;

        // 1. 배열 입력 + 합계 구하기
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        // 2. 평균 계산 (모든 입력 후에!)
        double avg = (double) sum / n;
        System.out.println("평균 : " + avg);

        // 3. 평균보다 큰 값 출력
        System.out.print("평균보다 큰 값 : ");
        for (int i = 0; i < n; i++) {
            if (arr[i] > avg) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();

        // 4. 평균보다 작은 값 출력
        System.out.print("평균보다 작은 값 : ");
        for (int i = 0; i < n; i++) {
            if (arr[i] < avg) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
