package entry;

public class Test14 {

    public static void main(String[] args) {
        /*
        * 편지
        *
        * 문제 설명
        * 머쓱이는 할머니께 생신 축하 편지를 쓰려고 합니다. 할머니가 보시기 편하도록 글자 한 자 한 자를 가로 2cm 크기로 적으려고 하며,
        * 편지를 가로로만 적을 때, 축하 문구 message를 적기 위해 필요한 편지지의 최소 가로길이를 return 하도록 solution 함수를 완성해주세요.
        *
        * 입출력 예 #1
        * message의 글자 수가 15개로 최소 가로 30cm의 편지지가 필요합니다.
        * 입출력 예 #2
        * message의 글자 수가 11개로 최소 가로 22cm의 편지지가 필요합니다.
        */
        class Solution {
            public int solution(String message) {
                int answer = 0;
                int length = message.length();
                return answer = message.length() *2 ;
            }
        }
    }
}
