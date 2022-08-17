package SomeTasks.SquareFinder;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SquareFinderTest {

    SquareFinder squareFinder = new SquareFinder();

    @ParameterizedTest
    @MethodSource("testCases")
    void squareFinderTest(Rectangle input, double expectedValue) {
        double actualValue = squareFinder.findMinSquare(input);

        assertEquals(expectedValue, actualValue);
    }

    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(
                        new Rectangle(0, 0),
                        0
                ),
                Arguments.of(
                        new Rectangle(50, 25),
                        25
                ),
                Arguments.of(
                        new Rectangle(1680, 640),
                        80
                )
        );
    }
}