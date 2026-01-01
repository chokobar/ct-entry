package algorithmBasic;

import java.util.Scanner;

public class AlgorithmBasic37 {
    public static void main(String[] args) {

        /**
         * 문제명: 신호등 판단 문제
         *
         * 요구사항
         * 문자열 color가 주어진다.
         *
         * 조건
         * "RED" → "정지"
         * "YELLOW" → "주의"
         * "GREEN" → "출발"
         * 그 외 값 → "오류"
         *
         */
        Scanner text = new Scanner(System.in);

        System.out.print("신호 입력: ");
        String signalText = text.next();

        if(signalText.equals("RED")){
            System.out.println("정지");
        }else if(signalText.equals("YELLOW")){
            System.out.println("정지");
        }else if(signalText.equals("GREEN")){
            System.out.println("출발");
        }else {
            System.out.println("오류");
        }

    }
}
