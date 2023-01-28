package ch14.sec05.exam03;

public class YieldExample {
    public static void main(String[] args) {
        WorkThread workThreadA = new WorkThread("WorkThreadA");
        WorkThread workThreadB = new WorkThread("WorkthreadB");
        workThreadA.start();
        workThreadB.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        workThreadA.work = false;

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        workThreadB.work = true;
    }

}
