package ch04;

public class Ex04_1 {
    public static void main(String args[]){
        MyMath mm = new MyMath();

        long result = mm.max(5,3);
        long result1 = mm.add(5L,3L);       // add 메서드 호출  - > 작업을 마친 후 호출한 곳으로 돌아옴
        long result2 = mm.substract(5L , 3L);
        long result3 = mm.multiply(5L, 3L);
        double result4 = mm.divide(5L, 3L);
        mm.printGugudan(3);

        System.out.println("max(5L, 3L) = " +result);
        System.out.println("add(5L, 3L) = " +result1);
        System.out.println("substract(5L, 3L) = " +result2);
        System.out.println("multiply(5L, 3L) = " +result3);
        System.out.println("divide(5L, 3L) = " +result4);

    }
}

class MyMath {

    void printGugudan(int dan){
        if(!(2<=dan && dan <=9)){
            return; // 입력받은 단이 2~9 가 아니면 ,메서드 종료하고 돌아가기
        }
        for(int i=1; i<=9; i++){
            System.out.printf("%d * %d = %d%n",dan, i ,dan * i);
        }
        return;
    }
    long add(long a, long b){

        return a + b ;
    }

    long max(long a, long b){

        return a > b ? a: b ;
    }

    long substract(long a, long b){

        return a - b ;
    }

    long multiply(long a, long b){

        return a * b ;
    }

    double divide(double a, double b){

        return a / b ;
    }

}
