package ch02.sec12;

public class PrintfExample {
    public static void main(String[] args) {
        int value = 123;
        System.out.printf("%dwon\n", value);
        System.out.printf("%6dwon\n", value);
        System.out.printf("%-6dwon\n", value);
        System.out.printf("%06dwon\n", value);

        double area = 3.14159 * 10 * 10;
        System.out.printf("r = %d circle's area: %10.2f\n", 10 ,area);

        String name = "hong-gil-dong";
        String job = "thief";
        System.out.printf("%6d | %-10s | %10s\n", 1 , name, job);
    }
}
