package entry;

public class Test67 {

    public static void main(String[] args) {
        /*
         * 아진수 바꾸기
         *
         * 이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때,
         * 두 이진수의 합을 return하도록 solution 함수를 완성해주세요.
         *
         *
         * 입출력 예 #1
         * 10 + 11 = 101 이므로 "101" 을 return합니다.
         *
         * 입출력 예 #2
         * 1001 + 1111 = 11000 이므로 "11000"을 return합니다.
         *
         * bin1	    bin2	    result
         * "10"	    "11"	    "101"
         * "1001"	"1111"	    "11000"
         */
        class Solution {
            public String solution(String bin1, String bin2) {
                String answer = "";
                int num1 = Integer.parseInt(bin1, 2);
                int num2 = Integer.parseInt(bin2, 2);

                answer = Integer.toBinaryString(num1 + num2);
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution("10" , "11");
    }
}