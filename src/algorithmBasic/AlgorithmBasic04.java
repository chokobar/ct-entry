package algorithmBasic;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmBasic04 {

    public static void main(String[] args) {

        /**
         * 문제명: 구구단 출력기
         *
         * 정수 n이 주어질 때,
         * n단의 구구단 결과를 출력하고,
         * 그 결과를 배열로 리턴하는 함수를 작성하시오.
         * (단, 1 ≤ n ≤ 9)
         *
         * 예시 입력/출력
         * 입력: 3
         * 출력:
         * 3 * 1 = 3
         * 3 * 2 = 6
         * ...
         * 3 * 9 = 27
         *
         * 리턴: [3, 6, 9, 12, 15, 18, 21, 24, 27]
         */
        System.out.print("입력 : " );
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] result = new int[9]; // 1~9까지 결과를 담을 배열

        for (int i = 1; i <= 9; i++) {
            int number = n * i;
            result[i - 1] = number; // 배열은 0부터 시작이니까
            System.out.println(n + " * " + i + " = " + number);
        }

        System.out.println("리턴 배열: " + Arrays.toString(result));
    }
}
