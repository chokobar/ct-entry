package entry;

import java.util.Arrays;

public class Test65 {

    public static void main(String[] args) {
        /*
         * 7의 개수
         *
         * 입출력 예 #1
         * [7, 77, 17]에는 7이 4개 있으므로 4를 return 합니다.
         *
         * 입출력 예 #2
         * [10, 29]에는 7이 없으므로 0을 return 합니다.
         *
         * array	    result
         * [7, 77, 17]	4
         * [10, 29]	0
         *
         *
         */
        class Solution {
            public int solution(int[] array) {
                int answer = 0;
                for (int i = 0; i < array.length; i++) {
                    String num = Integer.toString(array[i]);
                    String[] arr = num.split("");
                    for(int j=0; j<arr.length; j++){
                        if(arr[j].equals("7")){
                            answer++;
                        }
                    }
                }
                System.out.println(answer);
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution(new int[]{7, 77, 17});
    }
}