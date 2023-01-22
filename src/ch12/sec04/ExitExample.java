package ch12.sec04;

public class ExitExample {
    public static void main(String[] args) {
        for(int i=0; i<= 5; i++) {
            System.out.println(i);
            if(i== 5) {
                System.out.println("강제 종료");
                System.exit(0);
            }
        }
    }
}
