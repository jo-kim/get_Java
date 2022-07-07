package ch02;

public class Ex2_1 {
    public static void main(String[] args) {
        /**
         * 변수 (variable) : 하나의 값을 저장할 수 있는 메모리 공간
         * 특정 메모리 영역에 이름을 붙이고
         * 주소 대신 이름을 이용해서
         * 메모리의 값을 저장하고 읽을 수 있게 한 것.
         * 변수는 단 하나의 값만 저장.
         */

        /**
         * 변수 선언 : 값(data)를 저장할 공간을 마련하기 위해
         * 변수 타입 변수이름;
         */
        // 변수의 초기화: 변수에 처음으로 값을 저장하는 것
        int age = 25;

        /**
         * 변수의 종류
         * - 클래스 변수
         * - 인스턴스 변수
         * - 지역 변수  : 위의 두 변수와 달리 사용되기 전에 반드시 초기화를 해주어야 한다.
         */

        int x = 4, y = 2;

        System.out.println(x+y);
        System.out.println(x-y);
        System.out.println(x*y);
        System.out.println(x/y);
    }
}
