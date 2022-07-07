package ch02;

public class Ex2_3 {
    public static void main(String[] args) {

        /**
         * 변수와 리터럴의 타입 불일치
         * 1. 범위가 ' 변수 > 리터럴 ' 인 경우  OK
         * 2. 범위가 ' 변수 < 리터럴 ' 인 경우 ERROR
         * 3. byte, short 변수에 int 리터럴 저장 가능
         */
        int i = 'A';  //ascii code 65
        long l = 123;
        double d = 3.14f;
        ///////////////
        //	int ii = 30_0000_0000; // int의 범위  20억에 벗어남
        //	long ll = 3.14f; //  long < float 실수형은 정수형보다 저장범위가 넓기 때문에 ERROR

        // * byte의 범위 (-128~127) 내
        byte b = 100;

        char ch = 'A';
        System.out.println(ch);
        System.out.println(i);
        System.out.println(""+7+7); // 77 나옴 // "" + 7 = "7"// "7"+7 = "77"
    }

}
