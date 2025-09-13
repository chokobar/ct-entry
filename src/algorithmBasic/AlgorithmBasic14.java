package algorithmBasic;

import java.util.Scanner;

public class AlgorithmBasic14 {

    public static void main(String[] args) {

        /**
         * 문제명: 배열의 합 구하기
         *
         * 사용자로부터 정수 5개를 입력받아 배열에 저장한 후,
         * 배열에 저장된 모든 정수의 합을 출력하는 프로그램을 작성
         *
         * 요구사항
         *
         * 길이 5짜리 int 배열을 선언한다.
         * for문을 이용해 사용자 입력을 배열에 저장한다.
         * 또 다른 for문(또는 향상된 for문)을 사용해 합계를 구한다.
         * 최종 합계를 출력한다.
         *
         */
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];  // 길이 5 배열
        System.out.println("정수 5개를 입력하세요:");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("배열의 합: " + sum);
    }
}
