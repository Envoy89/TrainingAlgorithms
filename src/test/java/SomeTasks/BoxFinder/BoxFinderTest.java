package SomeTasks.BoxFinder;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BoxFinderTest {
    BoxFinder boxFinder = new BoxFinder();

    @ParameterizedTest
    @MethodSource("testCases")
    void findKeyWithLoopTest(Box inputBox, Key expectedKey) {
        Key actualValue = boxFinder.findKeyWithLoop(inputBox);

        if (expectedKey == null) {
            assertNull(actualValue);
        } else {
            assertEquals(expectedKey.getValue(), actualValue.getValue());
        }
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void findKeyWithRecursive(Box inputBox, Key expectedKey) {
        Key actualValue = boxFinder.findKeyWithRecursive(inputBox);

        if (expectedKey == null) {
            assertNull(actualValue);
        } else {
            assertNotNull(actualValue);
            assertEquals(expectedKey.getValue(), actualValue.getValue());
        }
    }

    private static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of(
                    new Box(
                            new ArrayList<>() {{
                                add(new Key("123"));
                            }}
                    ),
                    new Key("123")
                ),
                Arguments.of(
                        new Box(
                                new ArrayList<>() {{
                                    add(new Box(new ArrayList<>()));
                                    add(new Box(new ArrayList<>()));
                                    add(new Box(new ArrayList<>()));
                                    add(new Key("123"));
                                }}
                        ),
                        new Key("123")
                ),
                Arguments.of(
                        new Box(
                                new ArrayList<>() {{
                                    add(new Box(new ArrayList<>()));
                                    add(new Box(new ArrayList<>()));
                                    add(new Box(new ArrayList<>()));
                                }}
                        ),
                        null
                ),
                Arguments.of(
                        new Box(
                                new ArrayList<>() {{
                                    add(new Box(
                                            new ArrayList<>() {{
                                                add(new Key("123"));
                                            }}
                                    ));
                                    add(new Box(new ArrayList<>()));
                                    add(new Box(new ArrayList<>()));
                                }}
                        ),
                        new Key("123")
                ),
                Arguments.of(
                        new Box(
                                new ArrayList<>() {{
                                    add(new Box(
                                            new ArrayList<>() {{
                                                add(new Box(new ArrayList<>() {{
                                                    add(new Box(new ArrayList<>()));
                                                    add(new Box(new ArrayList<>()));
                                                    add(new Box(new ArrayList<>() {{
                                                        add(new Box(new ArrayList<>()));
                                                        add(new Box(new ArrayList<>()));
                                                        add(new Key("key value"));
                                                    }}));
                                                }}));
                                                add(new Box(new ArrayList<>()));
                                                add(new Box(new ArrayList<>()));
                                            }}
                                    ));
                                    add(new Box(new ArrayList<>()));
                                    add(new Box(new ArrayList<>()));
                                }}
                        ),
                        new Key("key value")
                ),
                Arguments.of(
                        new Box(
                                new ArrayList<>() {{
                                    add(new Box(
                                            new ArrayList<>() {{
                                                add(new Box(new ArrayList<>() {{
                                                    add(new Box(new ArrayList<>()));
                                                    add(new Box(new ArrayList<>()));
                                                    add(new Box(new ArrayList<>() {{
                                                        add(new Box(new ArrayList<>()));
                                                        add(new Box(new ArrayList<>()));
                                                        add(new Key("key value"));
                                                        add(new Pepper("123"));
                                                        add(new Pepper("123"));
                                                    }}));
                                                    add(new Pepper("123"));
                                                    add(new Pepper("123"));
                                                }}));
                                                add(new Box(new ArrayList<>()));
                                                add(new Box(new ArrayList<>()));
                                                add(new Pepper("123"));
                                                add(new Pepper("123"));
                                            }}
                                    ));
                                    add(new Box(new ArrayList<>() {{
                                        add(new Pepper("123"));
                                        add(new Pepper("123"));
                                        add(new Pepper("123"));
                                    }}));
                                    add(new Box(new ArrayList<>()));
                                    add(new Pepper("123"));
                                }}
                        ),
                        new Key("key value")
                ),
                Arguments.of(
                        new Box(
                                new ArrayList<>() {{
                                    add(new Box(
                                            new ArrayList<>() {{
                                                add(new Box(new ArrayList<>() {{
                                                    add(new Box(new ArrayList<>()));
                                                    add(new Box(new ArrayList<>()));
                                                    add(new Box(new ArrayList<>() {{
                                                        add(new Box(new ArrayList<>()));
                                                        add(new Box(new ArrayList<>()));
                                                        add(new Pepper("123"));
                                                        add(new Pepper("123"));
                                                    }}));
                                                    add(new Pepper("123"));
                                                    add(new Pepper("123"));
                                                }}));
                                                add(new Box(new ArrayList<>()));
                                                add(new Box(new ArrayList<>()));
                                                add(new Pepper("123"));
                                                add(new Pepper("123"));
                                            }}
                                    ));
                                    add(new Box(new ArrayList<>() {{
                                        add(new Pepper("123"));
                                        add(new Pepper("123"));
                                        add(new Pepper("123"));
                                    }}));
                                    add(new Box(new ArrayList<>()));
                                    add(new Pepper("123"));
                                }}
                        ),
                        null
                ),
                Arguments.of(
                        new Box(
                                new ArrayList<>() {{
                                    add(new Box(
                                            new ArrayList<>() {{
                                                add(new Box(new ArrayList<>() {{
                                                    add(new Box(new ArrayList<>()));
                                                    add(new Box(new ArrayList<>()));
                                                    add(new Box(new ArrayList<>() {{
                                                        add(new Box(new ArrayList<>()));
                                                        add(new Box(new ArrayList<>()));
                                                        add(new Key("key value"));
                                                        add(new Pepper("123"));
                                                        add(new Pepper("123"));
                                                    }}));
                                                    add(new Pepper("123"));
                                                    add(new Pepper("123"));
                                                    add(new Key("key value"));
                                                }}));
                                                add(new Box(new ArrayList<>()));
                                                add(new Box(new ArrayList<>()));
                                                add(new Pepper("123"));
                                                add(new Pepper("123"));
                                                add(new Key("key value"));
                                            }}
                                    ));
                                    add(new Box(new ArrayList<>() {{
                                        add(new Pepper("123"));
                                        add(new Pepper("123"));
                                        add(new Pepper("123"));
                                        add(new Key("key value"));
                                    }}));
                                    add(new Box(new ArrayList<>()));
                                    add(new Pepper("123"));
                                    add(new Key("key value"));
                                }}
                        ),
                        new Key("key value")
                )
        );
    }
}