package SomeTasks.SumArrayElements;

import org.apache.commons.lang3.ArrayUtils;

public class SumArrayElements {
    public int sum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int elemSum = 0;

        for (int j : arr) {
            elemSum += j;
        }

        return elemSum;
    }

    public int sumRecursive(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        return arr[0] + sumRecursive(ArrayUtils.remove(arr, 0));
    }
}
