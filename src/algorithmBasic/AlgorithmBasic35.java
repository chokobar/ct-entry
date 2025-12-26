package algorithmBasic;

import java.util.Scanner;

public class AlgorithmBasic35 {
    public static void main(String[] args) {

        /**
         * 문제명: 윤년 판별
         *
         * 요구사항
         * 연도 year가 주어질 때 윤년이면 "YES", 아니면 "NO" 출력
         *
         * 윤년 조건
         * 4로 나누어 떨어지고
         * 100으로 나누어 떨어지지 않거나
         * 400으로 나누어 떨어지면 윤년
         */
        Scanner year = new Scanner(System.in);

        System.out.print("연도 입력: ");
        int num = year.nextInt();

        if ((num % 4 == 0 && num % 100 != 0) || (num % 400 == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
