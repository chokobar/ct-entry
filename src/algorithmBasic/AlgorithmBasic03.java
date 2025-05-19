package algorithmBasic;

public class AlgorithmBasic03 {

    public static void main(String[] args) {

        /**
         * 문제명: 배열에서 음수 개수 세기
         *
         * 정수 배열 arr가 주어질 때,
         * 그 안에 있는 음수의 개수를 세어서 반환하는 함수를 작성하시오.
         *
         * 예시 입력/출력
         * solution([1, -3, 5, -2, 0, 9]) → 2
         * solution([10, 20, 30]) → 0
         */
        class Solution {
            public int solution(int[] array) {
                int answer = 0;
                for (int i = 0; i < array.length; i++) {
                    if (array[i] < 0) {
                        answer++;
                    }
                }
                System.out.println(answer);
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution(new int[]{1, -3, 5, -2, 0, 9});
    }
}
