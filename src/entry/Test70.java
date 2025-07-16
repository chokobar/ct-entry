package entry;

public class Test70 {

    public static void main(String[] args) {
        /*
         * 인덱스 바꾸기
         *
         * 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때,
         * my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을
         * return 하도록 solution 함수를 완성해보세요.
         *
         * 입출력 예 설명
         * 입출력 예 #1
         * "hello"의 1번째 인덱스인 "e"와 2번째 인덱스인 "l"을 바꾸면 "hlelo"입니다.
         *
         * 입출력 예 #2
         * "I love you"의 3번째 인덱스 "o"와 " "(공백)을 바꾸면 "I l veoyou"입니다.
         *
         * my_string	    num1	    num2	    result
         * "hello"	        1	        2	        "hlelo"
         * "I love you"	    3	        6	        "I l veoyou"
         *
         */
        class Solution {
            public String solution(String my_string, int num1, int num2) {
                StringBuilder sb = new StringBuilder(my_string);

                char ch1 = sb.charAt(num1);
                char ch2 = sb.charAt(num2);

                sb.setCharAt(num1, ch2);
                sb.setCharAt(num2, ch1);

                System.out.println("결과 값 : " + sb.toString());
                return sb.toString();
            }
        }


        Solution sol = new Solution();
        sol.solution("hello" , 1 ,2);
    }
}