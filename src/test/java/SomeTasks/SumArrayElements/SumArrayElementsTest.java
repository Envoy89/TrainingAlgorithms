package SomeTasks.SumArrayElements;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SumArrayElementsTest {

    SumArrayElements sumArrayElements = new SumArrayElements();

    @ParameterizedTest
    @MethodSource("testCases")
    public void testSum(int[] inputArr, int expectedSum) {
        int actualSum = sumArrayElements.sum(inputArr);

        assertEquals(expectedSum, actualSum);
    }

    @ParameterizedTest
    @MethodSource("testCases")
    public void testSumRecursive(int[] inputArr, int expectedSum) {
        int actualSum = sumArrayElements.sumRecursive(inputArr);

        assertEquals(expectedSum, actualSum);
    }


    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(
                        new int[] {1, 2, 3},
                        6
                ),
                Arguments.of(
                        new int[] {-1, -2, -3},
                        -6
                ),
                Arguments.of(
                        new int[] {-10, -5, 0},
                        -15
                ),
                Arguments.of(
                        new int[] {-10, -5, 5, 50, 10},
                        50
                ),
                Arguments.of(
                        new int[] {},
                        0
                ),
                Arguments.of(
                        null,
                        0
                )
        );
    }

}