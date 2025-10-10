package algorithmBasic;

import java.util.Scanner;

public class AlgorithmBasic31 {
    public static void main(String[] args) {

        /**
         * 문제명: 교통카드 할인 버스 요금 계산기
         *
         * 승객의 나이(age) 와 교통카드 사용 여부(card) 를 입력받아,
         * 나이에 따른 기본 요금에서 교통카드 20% 할인을 적용하여 최종 요금을 계산하세요.
         */
        Scanner sc01 = new Scanner(System.in);
        Scanner sc02 = new Scanner(System.in);

        System.out.print("나이 입력: ");
        int age = sc01.nextInt();

        System.out.print("교통카드 사용 여부(Y/N): ");
        String card = sc02.next();

        double fare = 0;

        if (age < 0 || age > 120) {
            System.out.println("잘못된 나이입니다.");
        } else if ((age >= 0 && age <= 7) || (age >= 65)) {
            System.out.println("무료입니다.");
        } else if (age >= 8 && age <= 19) {
            fare = 1200;
            if (card.equalsIgnoreCase("Y")) {
                fare *= 0.8; // 20% 할인
                System.out.println("청소년 기본요금 1200원, 교통카드 20% 할인 적용 → 최종요금: " + (int)fare + "원");
            } else {
                System.out.println("청소년 요금: 1200원");
            }
        } else if (age >= 20 && age <= 64) {
            fare = 1500;
            if (card.equalsIgnoreCase("Y")) {
                fare *= 0.8;
                System.out.println("성인 기본요금 1500원, 교통카드 20% 할인 적용 → 최종요금: " + (int)fare + "원");
            } else {
                System.out.println("성인 요금: 1500원");
            }
        }
    }
}
