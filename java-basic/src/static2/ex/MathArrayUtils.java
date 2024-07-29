package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils() {

    }

    static int sum(int[] values) {
        int sum = 0;

        for (int i : values) {
            sum += i;
        }

        return sum;
    }

    static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    static int min(int[] values) {
        int min = Integer.MAX_VALUE;

        for (int i : values) {
            min = Math.min(min, i);
        }

        return min;
    }

    static int max(int[] values) {
        int max = Integer.MIN_VALUE;

        for (int i : values) {
            max = Math.max(max, i);
        }

        return max;
    }
}
