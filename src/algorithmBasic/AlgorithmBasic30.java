package algorithmBasic;

import java.util.Scanner;

public class AlgorithmBasic30 {
    public static void main(String[] args) {

        /**
         * 문제명: 버스 요금 계산기
         *
         * 승객의 나이(age) 를 입력받아, 아래 기준에 따라 요금을 출력하는 프로그램을 작성하세요.
         * 나이가 0보다 작거나 120을 초과하면 "잘못된 나이입니다."를 출력할 것.
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("나이 입력: ");
        int age = sc.nextInt();

        if (age < 0 || age > 120) {
            System.out.println("잘못된 나이입니다.");
        } else if ((age >= 0 && age <= 7) || (age >= 65)) {
            System.out.println("무료입니다.");
        } else if (age >= 8 && age <= 19) {
            System.out.println("청소년 요금은 1,200원입니다.");
        } else if (age >= 20 && age <= 64) {
            System.out.println("성인 요금은 1,500원입니다.");
        }

    }
}
