package algorithmBasic;

import java.util.Scanner;

public class AlgorithmBasic26 {
    public static void main(String[] args) {

        /**
         * 문제명: 배열에서 특정 값 찾기
         *
         * 정수 N을 입력받고, 이어서 N개의 정수를 배열에 저장한 뒤,
         * 찾고 싶은 정수 X를 입력받아 배열 안에 있는지 확인하고, 있다면 **인덱스(위치)**를 출력하세요.
         * 만약 없다면 "찾을 수 없습니다."라고 출력
         *
         *
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("N 입력: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("찾을 값 입력: ");
        int x = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                System.out.println("값 " + x + "은 인덱스 " + i + "에 있습니다.");
                found = true;
                break; // 찾았으니 종료
            }
        }

        if (!found) {
            System.out.println("찾을 수 없습니다.");
        }
    }
}
