package algorithmBasic;

import java.util.Scanner;

public class AlgorithmBasic07 {

    public static void main(String[] args) {

        /**
         * 문제명: 윤년(Leap Year) 판별하기
         *
         * 연도를 하나 입력받아 그 해가 윤년인지 평년인지 판별하는 프로그램을 작성하세요.
         *
         * 윤년 규칙
         * 연도가 4의 배수이면 윤년이다.
         * 단, 100의 배수이면 윤년이 아니다.
         * 단, 400의 배수이면 다시 윤년이다.
         *
         *
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("연도 입력 : ");
        int year = sc.nextInt();

        if (year % 400 == 0) {
            System.out.println("입력하신 연도 : " + year + " <윤년>");
        } else if (year % 100 == 0) {
            System.out.println("입력하신 연도 : " + year + " <윤년>이 아니다");
        } else if (year % 4 == 0) {
            System.out.println("입력하신 연도 : " + year + " <윤년>");
        } else {
            System.out.println("입력하신 연도 : " + year + " <윤년>이 아니다");
        }


    }
}
