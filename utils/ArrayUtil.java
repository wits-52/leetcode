package utils;

public final class ArrayUtil {
    public static int max(int[] arr) throws Exception {
        if (arr.length == 0) {
            throw new Exception("Cannot find max for an empty array");
        }

        int max = arr[0];

        for (int a: arr) {
            if (a > max) {
                max = a;
            }
        }

        return max;
    }
}
