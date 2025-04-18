package entry;


public class Test25 {

    public static void main(String[] args) {
        /*
         * 옷가게 할인 받기
         *
         * 문제 설명
         * 머쓱이네 옷가게는
         * 10만 원 이상 사면 5%,
         * 30만 원 이상 사면 10%,
         * 50만 원 이상 사면 20%를 할인해줍니다.
         * 구매한 옷의 가격 price가 주어질 때,
         * 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
         *
         * 입출력 예 #1
         * 입출력 예 #1
         * 150,000원에서 5%를 할인한 142,500원을 return 합니다.
         * 입출력 예 #2
         * 580,000원에서 20%를 할인한 464,000원을 return 합니다.
         *
         * 150,000 * 0.05 = 7,500
         * 150,000 - 7,500 = 142,500
         *
         * 580,000 * 0.2 = 116,000
         * 580,000 - 116,000 = 464,000
         *
         */
        class Solution {
            public int solution(int price) {
                int answer = 0;
                if (500000 <= price && price <= 1000000) {
                    answer = (int) (price * 0.8);
                } else if (300000 <= price && price <= 500000) {
                    answer = (int) (price * 0.9);
                } else if (100000 <= price && price <= 300000) {
                    answer = (int) (price * 0.95);
                } else {
                    answer = price;
                }
                return answer;
            }
        }
    }
}

