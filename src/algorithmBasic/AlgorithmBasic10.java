package algorithmBasic;

import java.util.Scanner;

public class AlgorithmBasic10 {

    public static void main(String[] args) {

        /**
         * 문제명: 1부터 N까지 숫자 출력하기
         *
         * 정수 N을 입력받아, 1부터 N까지의 숫자를 차례대로 출력하는 프로그램을 작성하세요.
         *
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력 : ");
        int number = sc.nextInt();

        for (int i = 1; i < number; i++) {
            System.out.printf(i + " ");
        }

    }
}
