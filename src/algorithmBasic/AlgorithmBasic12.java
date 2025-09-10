package algorithmBasic;

import java.util.Scanner;

public class AlgorithmBasic12 {

    public static void main(String[] args) {

        /**
         * 문제명: 구구단 출력기
         *
         * 정수 N을 입력받아, N단 구구단을 출력하는 프로그램을 작성
         *
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력 : ");
        int number = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
