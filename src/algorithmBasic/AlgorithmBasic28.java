package algorithmBasic;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmBasic28 {
    public static void main(String[] args) {

        /**
         * 문제명: 세 수 중 가장 큰 수 찾기
         *
         * 정수 세 개를 입력받아, 그 중에서 가장 큰 수를 출력하는 프로그램을 작성
         *
         * 요구사항
         * 반드시 if ~ else if ~ else 문을 사용할 것.
         * 세 수가 같을 경우 "세 수가 모두 같습니다." 라고 출력할 것.
         *
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("N 입력: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("세 수가 모두 같습니다.");
        } else if (a >= b && a >= c) {
            System.out.println("가장 큰 수는 " + a + "입니다.");
        } else if (b >= a && b >= c) {
            System.out.println("가장 큰 수는 " + b + "입니다.");
        } else {
            System.out.println("가장 큰 수는 " + c + "입니다.");
        }

    }
}
