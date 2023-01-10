package ch03.sec08;

public class BitLogicExample {
    public static void main(String[] args) {
        System.out.println("45 & 25 = " + (45 & 25));
        System.out.println("45 | 25 = " + (45 | 25));
        System.out.println("45 ^ 25 = " + (45 ^ 25));
        System.out.println("~45 = ~ " + (~45));
        System.out.println("-------------------------");

        byte receiveData = -128;

        //방법 1: 비트 논리곱 연산으로 Unsigned 정수 얻기
        int unsighnedInt1 = receiveData & 255;
        System.out.println(unsighnedInt1);

        //방법 2 : 자바 APIfmf dldydgotj Unsigned 정수 얻기
        int unsignedInt2  = Byte.toUnsignedInt(receiveData);
        System.out.println(unsignedInt2);

        int test = 136;
        byte btest = (byte) test;
        System.out.println(btest);
    }
}
