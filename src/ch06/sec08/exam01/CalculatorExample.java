package ch06.sec08.exam01;

public class CalculatorExample {
    public static void main(String[] args) {
        //Calculator 객체 생성
        Calculator myCalc = new Calculator();

        // 리턴갑이 없는 메소드 호출
        myCalc.powerOn();

        //plus 메소드 호출 시 5와 6을 매개값으로 제공하고,
        // 덧셈 결과를 리턴받아 result1 변수에 대입
        int result1 = myCalc.plus(5,6);
        System.out.println("result1 : " + result1 );

        //divide 메소드 호출시 10과 4를 매개값을 제공하고,
        // 덧셈 결과를 리턴받아 result2 변수에 대입
        int x = 10;
        int y = 4;
        double result2 = myCalc.divide(x,y);
        System.out.println("result2 : " + result2);

        myCalc.powerOff();
    }
}
