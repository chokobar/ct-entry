package algorithmBasic;

import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmBasic05 {

    public static void main(String[] args) {

        /**
         * 문제명: 3자리 암호 판별기
         *
         * 어떤 시스템은 3자리 숫자 비밀번호를 사용합니다.
         * 비밀번호는 다음 조건을 모두 만족해야 합니다
         *
         * 세 자리 정수(100 ~ 999) 이어야 한다.
         * 세 자리 중 하나라도 같은 숫자가 있으면 안 된다. (예: 112, 787 → ❌)
         * 각 자리 숫자의 합이 짝수여야 한다. (예: 1+2+3 = 6 → 짝수 ✔)
         * 첫 번째 자리 숫자가 마지막 자리 숫자보다 커야 한다. (예: 532 → ✔, 239 → ❌)
         * 입력된 숫자가 위 조건을 모두 만족하면 "VALID", 그렇지 않으면 "INVALID"를 출력하세요.
         *
         * 예시 입력/출력
         * 입력: 532
         * 출력: VALID
         *
         * 조건
         * 반드시 if문을 사용하여 모든 조건을 판별할 것.
         * 반복문(for, while)은 사용하지 않고, 단순 분기(if)와 산술 연산으로 해결할 것.
         *
         */
        System.out.print("입력 : " );
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("INVALID");
            return;
        }

        int first = number / 100;
        int second = (number / 10) % 10;
        int third = number % 10;

        // 조건1: 세 자리 중 중복 숫자 검사
        if (first == second || first == third || second == third) {
            System.out.println("INVALID");
        }
        // 조건2: 합이 짝수
        else if ( (first + second + third) % 2 != 0 ) {
            System.out.println("INVALID");
        }
        // 조건3: 첫 번째 > 마지막
        else if (first <= third) {
            System.out.println("INVALID");
        }
        else {
            System.out.println("VALID");
        }

    }
}
