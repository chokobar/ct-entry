package algorithmBasic;

import java.util.Scanner;

public class AlgorithmBasic34 {
    public static void main(String[] args) {

        /**
         * 문제명: 시간대/날씨/바람까지 고려한 복장 & 준비물 추천
         *
         * 요구사항
         * 아래 4가지를 입력받아 복장/준비물/경고 문구를 출력하세요.
         * 현재 기온 temp (정수, ℃)
         * 날씨 상태 weather (맑음 / 비 / 눈)
         * 시간대 time (아침 / 낮 / 저녁 / 심야)
         * 바람 세기 wind (정수, m/s)
         *
         * 기본 복장 (기온 기준)
         * <= 5℃ → 패딩
         * 6~11℃ → 코트
         * 12~16℃ → 자켓
         * 17~22℃ → 가디건/맨투맨
         * 23~27℃ → 얇은 셔츠
         * >= 28℃ → 반팔
         *
         * 날씨 보정
         * 비 → "우산 챙기세요 ☔"
         * 눈 → "장갑/목도리 챙기세요 🧤🧣"
         * 맑음 → "쾌청한 날씨입니다 🌞"
         *
         * 시간대 보정
         * 심야(22~05) → "밤에는 더 쌀쌀해요. 겉옷 하나 더!"
         * (입력은 문자열이지만, 심야면 위 문구를 추가로 출력)
         *
         * 바람 보정
         * wind >= 8 m/s → "바람이 강합니다. 방풍 가능 겉옷 추천 💨"
         *
         * 추가 경고
         * temp >= 33 → "폭염 주의! 수분 섭취 필수 ☀️"
         * temp <= -10 → "한파 주의! 노출 최소화 ❄️"
         *
         * 입력 유효성
         * temp < -50 || temp > 60 → "잘못된 온도입니다."
         * weather가 허용 값이 아니면 → "잘못된 날씨입니다."
         * time이 허용 값이 아니면 → "잘못된 시간대입니다."
         * wind < 0 → "잘못된 바람 값입니다."
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
