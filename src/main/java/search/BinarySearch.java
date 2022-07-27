package search;

public class BinarySearch implements ISearch {
    @Override
    public int searchElementIndex(int[] input_arr, int item) {
        int start = 0;
        int end = input_arr.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;
            int value = input_arr[mid];

            if (item == value) {
                return mid;
            } else if (item < value) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}
