package algorithmBasic;

import java.util.Scanner;

public class AlgorithmBasic06 {

    public static void main(String[] args) {

        /**
         * 문제명: 삼각형 판별하기
         *
         * 세 개의 양의 정수를 입력받아 삼각형의 세 변의 길이라고 할 때,
         * 다음 규칙에 따라 결과를 출력하는 프로그램을 작성하세요.
         *
         * 삼각형 성립 조건:
         * 세 변 중 어느 두 변의 합이 나머지 한 변보다 커야 한다.
         * (만약 조건을 만족하지 못하면 "INVALID" 출력)
         *
         * 성립한다면 종류 판별:
         * 세 변이 모두 같으면 "Equilateral" (정삼각형)
         * 두 변만 같으면 "Isosceles" (이등변삼각형)
         * 세 변이 모두 다르면 "Scalene" (부등변삼각형)
         * 직각삼각형(피타고라스 정리 만족)이면 "Right" (단, 우선순위는 직각 > 정/이등/부등)
         *
         * 입력 예시1
         * 3 4 5
         * 출력 예시 1
         * Right
         *
         *
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 입력 : ");
        int a = sc.nextInt();
        System.out.print("두번째 입력 : ");
        int b = sc.nextInt();
        System.out.print("세번째 입력 : ");
        int c = sc.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        // 삼각형 성립 조건 체크 (성립 못하면 바로 종료)
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("INVALID");
            return;
        }

        // 직각 여부를 최우선으로 판정
        long aa = 1L * a * a;
        long bb = 1L * b * b;
        long cc = 1L * c * c;

        if (aa + bb == cc || aa + cc == bb || bb + cc == aa) {
            System.out.println("Right");
            return;
        }

        // 나머지 분류
        if (a == b && b == c) {
            System.out.println("Equilateral");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }

    }
}
