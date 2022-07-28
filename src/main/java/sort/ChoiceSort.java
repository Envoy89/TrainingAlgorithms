package sort;

public class ChoiceSort implements ISort {
    public int[] sort(int[] inputArr) {
        if (inputArr == null) {
            return null;
        }

        int[] new_arr = new int[inputArr.length];

        int elementCount = inputArr.length;
        for (int i = 0; i < elementCount; i++) {
            int smallestIndex = searchSmallestIndex(inputArr);

            new_arr[i] = inputArr[smallestIndex];
            inputArr = removeElement(inputArr, smallestIndex);
        }

        return new_arr;
    }

    private int searchSmallestIndex(int[] inputArr) {
        if (inputArr == null || inputArr.length == 0) {
            return -1;
        }

        int smallestIndex = 0;

        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] < inputArr[smallestIndex]) {
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }

    private int[] removeElement(int[] inputArr, int removedIndex) {
        if (inputArr == null || inputArr.length == 0) {
            return null;
        }

        int[] newArray = new int[inputArr.length - 1];

        for (int i = 0; i < inputArr.length; i++) {
            if (i < removedIndex) {
                newArray[i] = inputArr[i];
            } else if (i > removedIndex) {
                newArray[i - 1] = inputArr[i];
            }
        }

        return newArray;
    }
}
