package ch02;

public class VariableInitializationExample {
    public static void main(String[] args) {
        int value = 10;
        int result = value + 10;

        //int result = value + 10; value는 초기화가 되지않아 컴파일 오류 발생

        System.out.println(result);
    }
}