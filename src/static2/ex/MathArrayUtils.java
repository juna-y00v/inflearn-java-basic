package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        //private 인스턴스 생성을 막는 방법 기억하기*
    }


    public static int sum(int[] array) {
        int sumTotal = 0;
        for (int i : array) {
            sumTotal += i;
        }
        return sumTotal;
    }

    public static double average(int[] array) {
        return (double) sum(array) / array.length;
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
