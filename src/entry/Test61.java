package entry;

import java.util.HashMap;
import java.util.Map;

public class Test61 {

    public static void main(String[] args) {
        /*
         * 모스부호
         *
         * 문제 설명
         * 머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다.
         * 그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다.
         * 문자열 letter가 매개변수로 주어질 때, letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
         * 모스부호는 다음과 같습니다.
         *
         * letter	result
         * ".... . .-.. .-.. ---"	"hello"
         * ".--. -.-- - .... --- -."	"python"
         *
         * 입출력 예 #1
         * .... = h
         * . = e
         * .-.. = l
         * .-.. = l
         * --- = o
         * 따라서 "hello"를 return 합니다.
         *
         * 입출력 예 #2
         * .--. = p
         * -.-- = y
         * - = t
         * .... = h
         * --- = o
         * -. = n
         * 따라서 "python"을 return 합니다.
         *
         * a ~ z에 해당하는 모스부호가 순서대로 담긴 배열입니다.
         * {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."}
         *
         */
        class Solution {
            public String solution(String letter) {
                String answer = "";
                String [] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
                Map<String, Character> morseMap = new HashMap<>();

                for(char i='a'; i<='z'; i++){
                    int index = i - 'a';
                    morseMap.put(morse[index], i);
                }

                String [] letters = letter.split(" ");
                for(int i=0; i<letters.length; i++){
                    if(morseMap.containsKey(letters[i])){
                        answer += morseMap.get(letters[i]);
                    }
                }
                System.out.println(answer);
                return answer;
            }
        }

        Solution sol = new Solution();
        sol.solution(".... . .-.. .-.. ---");
    }
}