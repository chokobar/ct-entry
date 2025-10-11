package algorithmBasic;

import java.util.Scanner;

public class AlgorithmBasic32 {
    public static void main(String[] args) {

        /**
         * 문제명: 온도에 따른 복장 추천 프로그램
         *
         * 사용자로부터 현재 기온(℃) 을 입력받아,
         * 아래 기준에 따라 어떤 옷을 입어야 할지 추천하는 프로그램을 작성하세요.
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("현재 기온 입력: ");
        int num = sc.nextInt();


        if (num < -30 || num > 60) {
            System.out.println("잘못된 입력입니다.");
        } else if (num <= 5) {
            System.out.println("패딩 \uD83E\uDDE5❄\uFE0F");
        } else if (num <= 11) {
            System.out.println("코트 \uD83E\uDDE5");
        } else if (num <= 16) {
            System.out.println("자켓 \uD83E\uDDE5");
        } else if (num <= 22) {
            System.out.println("가디건 또는 맨투맨 \uD83D\uDC55\uD83E\uDDE5");
        } else if (num <= 27) {
            System.out.println("얇은 셔츠 \uD83D\uDC54");
        } else {
            System.out.println("반팔 티셔츠 \uD83D\uDC55");
        }

    }
}
