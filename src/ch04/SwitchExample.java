package ch04;

public class SwitchExample {
    public static void main(String[] args) {
        int num = (int)(Math.random()*6) +1;

        switch (num) {
            case 1:
                System.out.println("1 나왔습니다.");
                break;
            case 2:
                System.out.println("2 나왔습니다.");
                break;
            case 3:
                System.out.println("3 나왔습니다.");
                break;
            case 4:
                System.out.println("4 나왔습니다.");
                break;
            case 5:
                System.out.println("5 나왔습니다.");
                break;
            default:
                System.out.println("6 나왔습니다.");
        }
    }
}
