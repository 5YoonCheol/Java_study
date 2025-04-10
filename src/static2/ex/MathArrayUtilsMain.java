package static2.ex;

import static static2.ex.MathArrayUtils.*;

public class MathArrayUtilsMain {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};

        int sum = sum(values);
        System.out.println("합계 : " + sum);

        double average = average(values);
        System.out.println("평균 : " + average);

        int min = min(values);
        System.out.println("최소값 : " + min);

        int max = max(values);
        System.out.println("최대값 : " + max);
    }
}
