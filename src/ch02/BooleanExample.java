package ch02;

public class BooleanExample {
    public static void main(String[] args) {
        boolean stop = true;
        if (stop) {
            System.out.println("STOP");
        }else {
            System.out.println("GO");
        }

        int x = 10;
        boolean result1 = ( x == 20);
        boolean result2 = ( x != 20);

        System.out.println("result 1 = " + result1);
        System.out.println("result 2 = " + result2);

    }
}
