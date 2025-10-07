package algorithmBasic;

import java.util.Scanner;

public class AlgorithmBasic29 {
    public static void main(String[] args) {

        /**
         * 문제명: 학점 계산기
         *
         * 학생의 점수(0~100) 를 입력받아 아래 기준에 따라 학점(Grade) 을 출력하는 프로그램을 작성하세요.
         *
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("점수 입력: ");
        int gradeNumber = sc.nextInt();

        if (gradeNumber >= 90 && gradeNumber <= 100) {
            System.out.println("학점은 A 입니다.");
        }else if (gradeNumber >= 80 && gradeNumber <= 89) {
            System.out.println("학점은 B 입니다.");
        }else if (gradeNumber >= 70 && gradeNumber <= 79) {
            System.out.println("학점은 C 입니다.");
        }else if (gradeNumber >= 60 && gradeNumber <= 69) {
            System.out.println("학점은 D 입니다.");
        } else if (gradeNumber >= 0 && gradeNumber <= 59) {
            System.out.println("학점은 F 입니다.");
        } else {
            System.out.println("잘못된 점수입니다.");
        }

    }
}
