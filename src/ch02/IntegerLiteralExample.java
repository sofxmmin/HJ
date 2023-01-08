package ch02;

public class IntegerLiteralExample {
    public static void main(String[] args) {
        int var1 = 0b1011; // 2진수는 0b , 0B로 시작
        int var2 = 0206; // 8진수는 0으로 시작
        int var3 = 365; // 10진수   , byte var3 = 365; < 컴파일 에러
        int var4 = 0xB3; //  0x, 0X로 시작하고 0~9 , ( A~F , a~f) 로 작성

        System.out.println("var1 :" + var1);
        System.out.println("var2 :" + var2);
        System.out.println("var3 :" + var3);
        System.out.println("var4 :" + var4);

    }
}