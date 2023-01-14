package ch06.sec06.exam01;

public class CarExample {
    public static void main(String[] args) {
        //Car 객체를 생성
        Car myCar = new Car();

        //Car 객체의 필드값 읽기
        System.out.println("모델 명 : " + myCar.model);
        System.out.println("시동여부 : "  + myCar.start);
        System.out.println("현재속도 :" + myCar.speed);
    }
}
