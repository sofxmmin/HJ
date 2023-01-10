package ch02;

public class VariableScopeExample {
    public static void main(String[] args) {
        int v1 = 15;
        if(v1>10) {
            int v2 = v1 - 10;
        }
        int v3 = v1 + 5; // v2 변수는 if안에서 사용 가능하기 때문에 컴파일오류
    }
}
