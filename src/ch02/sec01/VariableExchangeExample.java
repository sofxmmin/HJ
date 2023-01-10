package ch02;

public class VariableExchangeExample {
    public static void main(String[] args) {

        int x = 5;
        int y = 7;

        System.out.println("x = " + x + ", y = " + y);
        System.out.println("x and y. exchange");

        int tmp = x;
        x = y;
        y = tmp;

        System.out.println("x= " + x + ", y= " + y);
    }
}