package algorithmBasic;

import java.util.Scanner;

public class AlgorithmBasic33 {
    public static void main(String[] args) {

        /**
         * 문제명: 기온 + 날씨 기반 복장 & 준비물 추천 프로그램
         *
         * 좋아요 😎 이제 진짜 “if문 중급”으로 가봅시다.
         * 이번엔 기온 + 날씨(비/눈/맑음) 조건을 동시에 고려해서
         * 더 현실적인 “복장 + 준비물 추천 프로그램”을 만들어볼 거예요.
         */
        Scanner sc01 = new Scanner(System.in);

        System.out.print("현재 기온 입력: ");
        int num = sc01.nextInt();

        Scanner sc02 = new Scanner(System.in);

        System.out.print("날씨 상태 입력(맑음/비/눈): ");
        String str = sc02.nextLine();

        if (num < -30 || num > 60) {
            System.out.println("잘못된 입력입니다.");
        } else if (num <= 5) {
            System.out.println("패딩 \uD83E\uDDE5❄\uFE0F");
            if(str.equals("비")){
                System.out.println("우산 챙기세요");
            }else if(str.equals("눈")){
                System.out.println("따뜻하게 입고 장갑도 챙기세요");
            }else if(str.equals("맑음")){
                System.out.println("오늘 날씨가 맑아요");
            }
        } else if (num <= 11) {
            System.out.println("코트 \uD83E\uDDE5");
            if(str.equals("비")){
                System.out.println("우산 챙기세요");
            }else if(str.equals("눈")){
                System.out.println("따뜻하게 입고 장갑도 챙기세요");
            }else if(str.equals("맑음")){
                System.out.println("오늘 날씨가 맑아요");
            }
        } else if (num <= 16) {
            System.out.println("자켓 \uD83E\uDDE5");
            if(str.equals("비")){
                System.out.println("우산 챙기세요");
            }else if(str.equals("눈")){
                System.out.println("따뜻하게 입고 장갑도 챙기세요");
            }else if(str.equals("맑음")){
                System.out.println("오늘 날씨가 맑아요");
            }
        } else if (num <= 22) {
            System.out.println("가디건 또는 맨투맨 \uD83D\uDC55\uD83E\uDDE5");
            if(str.equals("비")){
                System.out.println("우산 챙기세요");
            }else if(str.equals("눈")){
                System.out.println("따뜻하게 입고 장갑도 챙기세요");
            }else if(str.equals("맑음")){
                System.out.println("오늘 날씨가 맑아요");
            }
        } else if (num <= 27) {
            System.out.println("얇은 셔츠 \uD83D\uDC54");
            if(str.equals("비")){
                System.out.println("우산 챙기세요");
            }else if(str.equals("눈")){
                System.out.println("따뜻하게 입고 장갑도 챙기세요");
            }else if(str.equals("맑음")){
                System.out.println("오늘 날씨가 맑아요");
            }
        } else {
            System.out.println("반팔 티셔츠 \uD83D\uDC55");
            if(str.equals("비")){
                System.out.println("우산 챙기세요");
            }else if(str.equals("눈")){
                System.out.println("따뜻하게 입고 장갑도 챙기세요");
            }else if(str.equals("맑음")){
                System.out.println("오늘 날씨가 맑아요");
            }
        }

    }
}
