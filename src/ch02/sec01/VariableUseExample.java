package ch02.sec01;

public class VariableUseExample {
    public static void main(String[] args) {
        int hour = 3;
        int minute = 5;

        System.out.println("hour:" + hour + " minute :" + minute);

        int totalTime = (60*hour) + minute;
        System.out.println("totaltime is " + totalTime);
    }
}
