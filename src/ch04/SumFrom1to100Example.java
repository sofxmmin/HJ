package ch04;

public class SumFrom1to100Example {
    public static void main(String[] args) {
        int i;
        int sum = 0;

        for (i=1; i<=100; i++) {
            sum += i;
        }
        System.out.println("1부터 " + (i-1) + "까지의 합 : " + sum);
    }
}