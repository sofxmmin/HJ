package ch16.sec05.exam04;

public class Example {
    public static int[] scores = {10, 50, 3};

    public static int maxOrMin(Operator operator) {
        int result = scores[0];
        for (int score : scores) {
            result = operator.apply(result, score);
        }
        return result;
    }

    public static void main(String[] args) {
        int max = maxOrMin(Math::max

        );
        System.out.println("최댓값 : " + max);

        int min = maxOrMin(Math::min

        );
        System.out.println("최솟값 : " + min);
    }
}
