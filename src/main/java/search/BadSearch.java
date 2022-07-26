package search;

public class BadSearch implements ISearch {
    @Override
    public Integer search(int[] input_arr, int item) {
        for (int j : input_arr) {
            if (j == item) {
                return j;
            }
        }

        return null;
    }
}
