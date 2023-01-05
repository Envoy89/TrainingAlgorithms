package sort;

public class MergeSort implements ISort {
    @Override
    public int[] sort(int[] arr) {
        if (arr == null) {
            return null;
        }
        if (arr.length == 0) {
            return arr;
        }
        return sort(arr, 0, arr.length - 1);
    }

    private int[] sort(int[] arr, int left, int right) {
        if (left == right) {
            return new int[] {
                arr[left]
            };
        }
        int mid = (left + right) / 2;
        int[] leftArr = sort(arr, left, mid);
        int[] rightArr = sort(arr, mid + 1, right);

        return merge(leftArr, rightArr);
    }

    private int[] merge(int[] leftArr, int[] rightArr) {
        int[] newArr = new int[leftArr.length + rightArr.length];
        int k = 0, l = 0, r = 0;
        while (l < leftArr.length && r < rightArr.length) {
            if (leftArr[l] < rightArr[r]) {
                newArr[k] = leftArr[l];
                l++;
            } else {
                newArr[k] = rightArr[r];
                r++;
            }
            k++;
        }
        while (l < leftArr.length) {
            newArr[k] = leftArr[l];
            l++;
            k++;
        }
        while (r < rightArr.length) {
            newArr[k] = rightArr[r];
            r++;
            k++;
        }
        return newArr;
    }
}
