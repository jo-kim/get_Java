package ch02;

import java.util.Date;

public class Ex2_4 {

    public static void main(String[] args) {

        /**
         * 기본형 과 참조형
         * 기본형 (Primitive)
         *  -8 개  (boolean, char, byte, short, int
         *  		long, float, double)
         *  - 실제 값을 저장
         *
         *  참조형 (Reference)
         *   - 기본형을 제외한 나머지 (String, System...etc)
         *   - 메모리 주소를 저장
         */
        Date today; // 참조형 변수 today 선언
        today = new Date(); // today에 객체의 주소를 저장
    }

}
