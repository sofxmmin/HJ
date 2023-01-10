package ch04;

import java.util.Scanner;

public class KeyControlExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int speed = 0;

        while (run) {
            System.out.println("----------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 종료 ");
            System.out.println("----------------------------");
            System.out.println("선택해주세요.");

            String strNum = scanner.nextLine();

            if (strNum.equals("1")) {
                System.out.println("증속을 선택했습니다, 현재 속도 " + speed);
                speed++;
            } else if (strNum.equals("2")) {
                System.out.println("감속을 선택했습니다, 현재 속도 " + speed);
                speed--;
            } else if (strNum.equals("3")) {
                System.out.println("프로그램 종료, 현재 속도 " + speed);
                run = false;
            }
        }
        System.out.println("");
    }
}