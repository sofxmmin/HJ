package ch06.sec06.exam02;

public class CarExample {
    public static void main(String[] args) {
        //Car 객체를 생성
        Car myCar = new Car();

        //객체 필드 값 읽기
        System.out.println("회사명 : " + myCar.company);
        System.out.println("모델명 : " + myCar.model);
        System.out.println("색깔 : " + myCar.color);
        System.out.println("현재 속도: " + myCar.speed);
        System.out.println("최고 속도 : " + myCar.maxSpeed);

        //Car 객체의 필드값 변경
        myCar.speed = 130;
        System.out.println("변경된 현재 속도 : " + myCar.speed);
    }
}
