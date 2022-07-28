package search;

public class BadSearch implements ISearch {
    @Override
    public int searchElementIndex(int[] inputArr, int item) {
        for (int j = 0; j < inputArr.length; j++) {
            if (inputArr[j] == item) {
                return j;
            }
        }

        return -1;
    }
}
