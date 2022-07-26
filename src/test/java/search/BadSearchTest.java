package search;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BadSearchTest {

    BadSearch search = new BadSearch();

    @ParameterizedTest
    @MethodSource
    void goodSimpleTest(int[] input_array, int searchValue, Integer expectedValue) {
        Integer actualValue = search.search(input_array, searchValue);

        assertEquals(expectedValue, actualValue);
    }

    private static Stream<Arguments> goodSimpleTest() {
        return Stream.of(
                Arguments.of(
                        new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                        5,
                        5
                )
        );
    }
}