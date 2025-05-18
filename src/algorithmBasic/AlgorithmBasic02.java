package algorithmBasic;

public class AlgorithmBasic02 {

    public static void main(String[] args) {

        /**
         * 문제명: 배열의 합
         *
         * 정수 배열 arr이 주어졌을 때,
         * 배열 안에 있는 모든 정수의 합을 반환하는 함수를 작성하시오.
         *
         * 예시 입력/출력
         * solution([1, 2, 3, 4, 5]) → 15
         * solution([10, -5, 7]) → 12
         */
        class Solution {
            public int solution(int[] array) {
                int answer = 0;
                for (int i = 0; i < array.length; i++) {
                   answer += array[i];

                }
                System.out.println(answer);
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution(new int[]{1, 2, 3, 4, 5});
    }
}
