package ch06.sec11.exam01;

public class KoreanExample {
    public static void main(String[] args) {
        //객체 생성시 주민등록번호와 이름 전달

        Korean k1 = new Korean("111111-1234567" , "김자바");

        //필드값 읽기
        System.out.println(k1.nation);
        System.out.println(k1.name);
        System.out.println(k1.ssn);

        k1.name = "김자바";

    }
}
