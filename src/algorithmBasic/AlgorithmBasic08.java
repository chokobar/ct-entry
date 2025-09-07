package algorithmBasic;

import java.util.Scanner;

public class AlgorithmBasic08 {

    public static void main(String[] args) {

        /**
         * 문제명: BMI(체질량지수) 계산기
         *
         * 사람의 키(cm)와 몸무게(kg)를 입력받아 BMI 지수를 계산하고,
         * 해당하는 체중 상태를 판별하는 프로그램을 작성하세요.
         *
         *
         * BMI 기준표
         * 18.5 미만 → "Underweight"
         * 18.5 이상 ~ 24.9 이하 → "Normal"
         * 25 이상 ~ 29.9 이하 → "Overweight"
         * 30 이상 → "Obese"
         *
         *
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("키 입력 : ");
        double heightCm = sc.nextDouble();
        double heightM = heightCm / 100.0;

        System.out.print("몸무게 입력 : ");
        double weight = sc.nextDouble();

        System.out.println("입력하신 키 : " + heightM);
        System.out.println("입력하신 몸무게 : " + weight);

        double bmi = weight / (heightM * heightM);
        System.out.println("BMI 값 : " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        }else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal");
        }else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }
}
