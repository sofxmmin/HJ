package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input X : ");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.println("input y : ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = x + y;
        System.out.println("result : " + result);
        System.out.println();


        while (true) {
            System.out.println("input String : ");
            String data = scanner.nextLine();
            if (data.equals("q")) {
                break;
            }
            System.out.println("input String : " + data);
            System.out.println();
        }
        System.out.println("exit");
    }
}
