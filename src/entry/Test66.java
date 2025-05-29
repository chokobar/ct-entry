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
                // 초기값 설정: 배열의 첫 번째 값을 정답 후보로 설정
                int answer = array[0];
                // n과 배열 첫 번째 값의 차이를 절댓값으로 계산하여 최소 차이(minDiff)로 설정
                int minDiff = Math.abs(n - array[0]);
                // 두 번째 요소부터 배열 끝까지 반복하며 가장 가까운 수를 찾음
                for (int i = 1; i < array.length; i++) {
                    // 현재 요소와 n의 차이를 절댓값으로 계산
                    int diff = Math.abs(n - array[i]);
                    // 현재 차이가 기존의 최소 차이보다 작으면
                    if (diff < minDiff) {
                        // 최소 차이를 갱신
                        minDiff = diff;
                        // 현재 값을 정답 후보로 설정
                        answer = array[i];
                    }
                    // 현재 차이가 최소 차이와 같지만, 값이 더 작다면
                    else if (diff == minDiff && array[i] < answer) {
                        // 더 작은 값을 정답 후보로 설정 (tie-breaker)
                        answer = array[i];
                    }
                }
                // 최종적으로 n과 가장 가까운 수를 반환
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution(new int[]{3, 10, 28} , 20);
    }
}