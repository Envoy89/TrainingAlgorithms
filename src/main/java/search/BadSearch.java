package search;

public class BadSearch implements ISearch {
    @Override
    public int searchElementIndex(int[] input_arr, int item) {
        for (int j = 0; j < input_arr.length; j++) {
            if (input_arr[j] == item) {
                return j;
            }
        }

        return -1;
    }
}
