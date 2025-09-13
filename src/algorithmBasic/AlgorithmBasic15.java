package algorithmBasic;

import java.util.Scanner;

public class AlgorithmBasic15 {

    public static void main(String[] args) {

        /**
         * 문제명: 배열의 최댓값과 최솟값 구하기
         *
         * 사용자로부터 정수 5개를 입력받아 배열에 저장한 후,
         * 배열에서 최댓값과 최솟값을 찾아 출력하는 프로그램을 작성
         *
         * 요구사항
         *
         * 길이 5짜리 int 배열을 선언한다.
         * for문을 이용해 사용자 입력을 배열에 저장한다.
         * 배열을 처음부터 끝까지 순회하면서 최댓값(max) 과 최솟값(min) 을 찾는다.
         * max = numbers[0];
         * min = numbers[0];
         * 로 초기화 후, 나머지 값들과 비교한다.
         * 최종적으로 max와 min을 출력한다.
         *
         */
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];  // 길이 5 배열
        System.out.println("정수 5개를 입력하세요 : ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        int minNumber = numbers[0];
        int maxNumber = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        System.out.println("최솟값: " + minNumber);
        System.out.println("최댓값: " + maxNumber);


    }
}
