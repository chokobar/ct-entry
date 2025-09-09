package algorithmBasic;

import java.util.Scanner;

public class AlgorithmBasic11 {

    public static void main(String[] args) {

        /**
         * 문제명: 1부터 N까지 합 구하기
         *
         * 정수 N을 입력받아, 1부터 N까지의 합을 계산해서 출력하는 프로그램을 작성
         *
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자 입력 : ");
        int number = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= number; i++) {

            sum += i;

        }
        System.out.println("1부터 " + number + "까지의 합은 " + sum + "입니다.");
    }
}
