package algorithmBasic;

import java.util.Scanner;

public class AlgorithmBasic13 {

    public static void main(String[] args) {

        /**
         * 문제명: 1부터 N까지 짝수의 합 구하기
         *
         * 정수 N을 입력받아, 1부터 N까지의 숫자 중 짝수만 골라서 합을 구하는 프로그램을 작성
         *
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력 : ");
        int number = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.printf("1부터 " + number + "까지 짝수의 합 : " + sum);
    }
}
