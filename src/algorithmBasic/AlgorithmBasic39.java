package algorithmBasic;

import java.util.Scanner;

public class AlgorithmBasic39 {
    public static void main(String[] args) {

        /**
         * 문제명: 서버 요청 처리 상태 판별
         *
         * 요구사항
         * int httpStatus;        // HTTP 상태 코드
         * boolean isTimeout;    // 타임아웃 발생 여부
         * boolean isRetry;      // 재시도 요청 여부
         * int retryCount;       // 재시도 횟수
         *
         * 상태 판별 규칙
         * 1️⃣ 타임아웃 발생
         * "TIMEOUT_ERROR"
         *
         * 2️⃣ HTTP 상태 코드가 500 이상
         * 재시도 요청 + 재시도 횟수 < 3
         * → "RETRYING"
         * 그 외
         * → "SERVER_ERROR"
         *
         * 3️⃣ HTTP 상태 코드가 400 이상 500 미만
         * "CLIENT_ERROR"
         *
         * 4️⃣ HTTP 상태 코드가 200 이상 300 미만
         * "SUCCESS"
         *
         * 5️⃣ 그 외 모든 경우
         * "UNKNOWN_STATUS"
         */

        Scanner sc = new Scanner(System.in);

        // 입력
        System.out.print("HTTP 상태 코드 입력: ");
        int httpStatus = sc.nextInt();

        System.out.print("타임아웃 발생 여부 (true/false): ");
        boolean isTimeout = sc.nextBoolean();

        System.out.print("재시도 요청 여부 (true/false): ");
        boolean isRetry = sc.nextBoolean();

        System.out.print("재시도 횟수 입력: ");
        int retryCount = sc.nextInt();

        // 상태 판별
        if (isTimeout) {
            System.out.println("TIMEOUT_ERROR");

        } else if (httpStatus >= 500) {

            if (isRetry && retryCount < 3) {
                System.out.println("RETRYING");
            } else {
                System.out.println("SERVER_ERROR");
            }

        } else if (httpStatus >= 400 && httpStatus < 500) {
            System.out.println("CLIENT_ERROR");

        } else if (httpStatus >= 200 && httpStatus < 300) {
            System.out.println("SUCCESS");

        } else {
            System.out.println("UNKNOWN_STATUS");
        }

        sc.close();
    }

}

