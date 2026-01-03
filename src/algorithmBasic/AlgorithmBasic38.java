package algorithmBasic;

import java.util.Scanner;

public class AlgorithmBasic38 {
    public static void main(String[] args) {

        /**
         * 문제명: 주문 결제 검증 로직
         *
         * 요구사항
         * int orderAmount;      // 주문 금액
         * boolean isLogin;      // 로그인 여부
         * boolean isBlackUser;  // 블랙리스트 여부
         * boolean hasCoupon;    // 쿠폰 보유 여부
         * boolean isVip;        // VIP 회원 여부
         *
         * 결제 가능 조건
         * 1️⃣ 블랙리스트면 → "결제 불가 (블랙리스트)"
         * 2️⃣ 로그인 안 함 → "로그인 필요"
         * 3️⃣ 주문 금액 10,000원 미만 → "최소 주문 금액 미달"
         * 4️⃣ 그 외는 결제 가능
         *
         * 할인 정책 (결제 가능할 때만 적용)
         * VIP + 쿠폰 → 30% 할인
         * VIP만 → 20% 할인
         * 쿠폰만 → 10% 할인
         * 둘 다 없음 → 할인 없음
         *
         *
         * 출력 요구사항
         * 결제 불가 시 → 사유만 출력
         * 결제 가능 시 → 최종 결제 금액 출력
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("주문 금액(orderAmount): ");
        int orderAmount = sc.nextInt();

        System.out.print("로그인 여부(isLogin) (true/false): ");
        boolean isLogin = sc.nextBoolean();

        System.out.print("블랙리스트 여부(isBlackUser) (true/false): ");
        boolean isBlackUser = sc.nextBoolean();

        System.out.print("쿠폰 보유 여부(hasCoupon) (true/false): ");
        boolean hasCoupon = sc.nextBoolean();

        System.out.print("VIP 여부(isVip) (true/false): ");
        boolean isVip = sc.nextBoolean();

        // 결제 검증
        if (isBlackUser) {
            System.out.println("결제 불가 (블랙리스트)");
            return;
        }

        if (!isLogin) {
            System.out.println("로그인 필요");
            return;
        }

        if (orderAmount < 10000) {
            System.out.println("최소 주문 금액 미달");
            return;
        }

        // 할인율 결정 (결제 가능할 때만)
        double discountRate = 0.0;

        if (isVip && hasCoupon) {
            discountRate = 0.30;
        } else if (isVip) {
            discountRate = 0.20;
        } else if (hasCoupon) {
            discountRate = 0.10;
        }

        // 최종 결제 금액 계산
        int discount = (int) (orderAmount * discountRate);
        int finalAmount = orderAmount - discount;

        System.out.println("결제금액: " + finalAmount);

        sc.close();
    }

}

