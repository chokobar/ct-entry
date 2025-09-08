package algorithmBasic;

import java.util.Scanner;

public class AlgorithmBasic09 {

    public static void main(String[] args) {

        /**
         * 문제명: 별 피라미드 출력하기
         *
         * 정수 N을 입력받아, 높이가 N인 왼쪽 정렬 피라미드 모양을 출력하는 프로그램을 작성
         *
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력 : ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
