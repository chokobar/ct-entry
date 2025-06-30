package entry;

import java.util.*;

public class Test68 {

    public static void main(String[] args) {
        /*
         * 한번만 등장하는 문자
         *
         * 문자열 s가 매개변수로 주어집니다.
         * s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
         * 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
         *
         * 입출력 예 설명
        * 입출력 예 #1
        * "abcabcadc"에서 하나만 등장하는 문자는 "d"입니다.
        *
        * 입출력 예 #2
        * "abdc"에서 모든 문자가 한 번씩 등장하므로 사전 순으로 정렬한 "abcd"를 return 합니다.
        * 입출력 예 #3
        * "hello"에서 한 번씩 등장한 문자는 "heo"이고 이를 사전 순으로 정렬한 "eho"를 return 합니다.
         *
         * s	            result
         * "abcabcadc"	    "d"
         * "abdc"	        "abcd"
         * "hello"	        "eho"
         */
        class Solution {
            public String solution(String s) {
                Map<Character, Integer> countMap = new HashMap<>();

                for (char c : s.toCharArray()) {
                    countMap.put(c, countMap.getOrDefault(c, 0) + 1);
                }

                List<Character> onceChars = new ArrayList<>();
                for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
                    if (entry.getValue() == 1) {
                        onceChars.add(entry.getKey());
                    }
                }

                Collections.sort(onceChars);

                StringBuilder result = new StringBuilder();
                for (char c : onceChars) {
                    result.append(c);
                }

                return result.toString();
            }
        }


        Solution sol = new Solution();
        sol.solution("abcabcadc" );
    }
}