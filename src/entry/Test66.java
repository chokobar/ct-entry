package entry;

public class Test66 {

    public static void main(String[] args) {
        /*
         * 가까운 수
         *
         * 정수 배열 array와 정수 n이 매개변수로 주어질 때,
         * array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
         *
         *
         * 입출력 예 #1
         * 3, 10, 28 중 20과 가장 가까운 수는 28입니다.
         *
         * 입출력 예 #2
         * 10, 11, 12 중 13과 가장 가까운 수는 12입니다.
         *
         * array	    n	    result
         * [3, 10, 28]	20	    28
         * [10, 11, 12]	13	    12
         */
        class Solution {
            public int solution(int[] array, int n) {
                int answer = array[0];
                int minDiff = Math.abs(n - array[0]);

                for (int i = 1; i < array.length; i++) {
                    int diff = Math.abs(n - array[i]);
                    if (diff < minDiff) {
                        minDiff = diff;
                        answer = array[i];
                    } else if (diff == minDiff && array[i] < answer) {
                        answer = array[i];
                    }
                }
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution(new int[]{3, 10, 28} , 20);
    }
}