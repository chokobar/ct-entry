package entry;

public class Test64 {

    public static void main(String[] args) {
        /*
         * 구슬을 나누는 경우의 수
         *
         * 문제 설명
         * 머쓱이는 구슬을 친구들에게 나누어주려고 합니다.
         * 구슬은 모두 다르게 생겼습니다.
         * 머쓱이가 갖고 있는 구슬의 개수 balls와 친구들에게 나누어 줄 구슬 개수 share이 매개변수로 주어질 때,
         * balls개의 구슬 중 share개의 구슬을 고르는 가능한 모든 경우의 수를 return 하는 solution 함수를 완성해주세요.
         *
         * balls	share	result
         * 3	    2	    3
         * 5	    3	    10
         *
         *
         */
        class Solution {
            public int solution(int balls, int share) {
                return (int)combination(balls, share);
            }

            private long combination(int n, int r) {
                long result = 1;
                for (int i = 1; i <= r; i++) {
                    result = result * (n - i + 1) / i;
                }
                return result;
            }
        }

        Solution sol = new Solution();
        sol.solution(3 ,2);
    }
}