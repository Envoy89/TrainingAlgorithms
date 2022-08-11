package search;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {

    ISearch binarySearch = new BinarySearch();
    ISearch badSearch = new BadSearch();

    @ParameterizedTest
    @MethodSource("goodSimpleTest")
    void binarySearchTest(int[] input_array, int searchValue, int expectedValue) {
        Integer actualValue = binarySearch.searchElementIndex(input_array, searchValue);

        assertEquals(expectedValue, actualValue);
    }

    @ParameterizedTest
    @MethodSource("goodSimpleTest")
    void badSearchTest(int[] input_array, int searchValue, int expectedValue) {
        Integer actualValue = badSearch.searchElementIndex(input_array, searchValue);

        assertEquals(expectedValue, actualValue);
    }

    private static Stream<Arguments> goodSimpleTest() {
        return Stream.of(
                Arguments.of(
                        new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        5,
                        4
                ),
                Arguments.of(
                        new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        4,
                        3
                ),
                Arguments.of(
                        new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        6,
                        5
                ),
                Arguments.of(
                        new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        10,
                        9
                ),
                Arguments.of(
                        new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        1,
                        0
                ),
                Arguments.of(
                        new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        15,
                        -1
                ),
                Arguments.of(
                        new int[] {},
                        15,
                        -1
                ),
                Arguments.of(
                        new int[] {1},
                        15,
                        -1
                ),
                Arguments.of(
                        new int[] {1},
                        1,
                        0
                )
        );
    }
}