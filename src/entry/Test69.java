package entry;

import java.util.*;

public class Test69 {

    public static void main(String[] args) {
        /*
         * ㅊ
         *
         * 머쓱이는 직육면체 모양의 상자를 하나 가지고 있는데 이 상자에 정육면체 모양의 주사위를 최대한 많이 채우고 싶습니다.
         * 상자의 가로, 세로, 높이가 저장되어있는 배열 box와 주사위 모서리의 길이 정수 n이 매개변수로 주어졌을 때,
         * 상자에 들어갈 수 있는 주사위의 최대 개수를 return 하도록 solution 함수를 완성해주세요.
         *
         * 입출력 예 설명
         * 입출력 예 #1
         * 상자의 크기가 가로 1, 세로 1, 높이 1이므로 모서리의 길이가 1인 주사위는 1개 들어갈 수 있습니다.
         *
         *
         * 입출력 예 #2
         * 상자의 크기가 가로 10, 세로 8, 높이 6이므로 모서리의 길이가 3인 주사위는 12개 들어갈 수 있습니다.
         *
         * box	        n	    result
         * [1, 1, 1]	1	    1
         * [10, 8, 6]	3	    12
         *
         */
        class Solution {
            public int solution(int[] box, int n) {
                int x = box[0] / n;
                int y = box[1] / n;
                int z = box[2] / n;

                System.out.println("결과 값 : " + x * y * z);
                return x * y * z;
            }
        }


        Solution sol = new Solution();
        sol.solution(new int[]{1, 1, 1} , 1);
    }
}