package sort;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SortTest {

    ISort choiceSort = new ChoiceSort();

    @ParameterizedTest
    @MethodSource("testCases")
    public void sortTest(int[] inputArr, int[] expectedResult) {
        int[] actualResult = choiceSort.sort(inputArr);

        if (expectedResult != null) {
            assertEquals(expectedResult.length, actualResult.length);

            for (int i = 0; i < expectedResult.length; i++) {
                assertEquals(expectedResult[i], actualResult[i]);
            }
        } else {
            assertNull(actualResult);
        }
    }

    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(
                        new int[] {
                                3, 2, 1
                        },
                        new int[] {
                                1, 2, 3
                        }
                ),
                Arguments.of(
                        new int[] {
                                3, 2, 4, 8, 9, 1, 2, 3, 45
                        },
                        new int[] {
                                1, 2, 2, 3, 3, 4, 8, 9, 45
                        }
                ),
                Arguments.of(
                        new int[] {
                                -3, 2, 4, 8, -9, 1, 2, 3, 45
                        },
                        new int[] {
                                -9, -3, 1, 2, 2, 3, 4, 8, 45
                        }
                ),
                Arguments.of(
                        new int[] {},
                        new int[] {}
                ),
                Arguments.of(
                        null,
                        null
                )
        );
    }
}