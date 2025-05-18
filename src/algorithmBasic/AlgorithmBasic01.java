package algorithmBasic;

public class AlgorithmBasic01 {

    public static void main(String[] args) {

        /**
         * 문제명: 홀짝 판별기
         *
         * 정수 num이 주어졌을 때,
         * 이 수가 짝수이면 "Even",
         * 홀수이면 "Odd"를 출력하는 함수를 작성하시오.
         *
         * 예시 입력/출력
         * solution(4) → "Even"
         * solution(7) → "Odd"
         */
        class Solution {
            public String solution(int n ) {
                String str = "";
                if (n % 2 == 0) {
                    str = "Even";
                }else {
                    str = "Odd";
                }
                System.out.println(str);
                return str;
            }
        }
        Solution sol = new Solution();
        sol.solution(4);
    }
}
