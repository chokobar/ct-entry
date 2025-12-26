package algorithmBasic;

import java.util.Scanner;

public class AlgorithmBasic36 {
    public static void main(String[] args) {

        /**
         * 문제명: 할인율 계산
         *
         * 요구사항
         * 정수 price, memberGrade가 주어진다.
         *
         * 등급	    할인율
         * 1	    5%
         * 2	    10%
         * 3	    20%
         * 그 외	    할인 없음
         *
         */
        Scanner num01 = new Scanner(System.in);

        System.out.print("가격 입력: ");
        int price = num01.nextInt();

        Scanner num02 = new Scanner(System.in);

        System.out.print("등급 입력: ");
        int memberGrade = num02.nextInt();

        int totalPrice = 0;
        double discountRate = 0.0;

        if (memberGrade == 1) {
            discountRate = 0.05;
        } else if (memberGrade == 2) {
            discountRate = 0.10;
        } else if (memberGrade == 3) {
            discountRate = 0.20;
        }

        totalPrice = price - (int)(price * discountRate);
        System.out.println("최종가격 : " + totalPrice);
    }
}
