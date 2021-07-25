package uk.co._4loop;

import org.junit.jupiter.api.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AssertionTest {

    @Test
    void testLambdaExpression() {
        assertTrue(Stream.of(1, 2, 3)
                .mapToInt(i -> i)
                .sum() > 5, () -> "Sum should be > 5");
    }

    @Test
    void testGroupAssertion() {
        int[] numbers = {0, 1, 2, 3, 4};
        assertAll("numbers",
                () -> assertEquals(0,numbers[0]),
                () -> assertEquals(3,numbers[3]),
                () -> assertEquals(1,numbers[4])
        );
    }

    @Test
    void dependentAssertions() {
        // Within a code block, if an assertion fails the subsequent code in the same block will be skipped.
        assertAll("properties",
                () -> {
                    String greeting = Demo.greeting();
                    assertNotNull(greeting);

                    // Executed only if the previous assertion is valid.
                    assertAll("Greeting chars",
                            () -> assertTrue(greeting.startsWith("H")),
                            () -> assertTrue(greeting.endsWith("!"))
                    );
                },
                () -> {
                    // Grouped assertion, so processed independently of results of first assertion.
                    String greeting = Demo.greeting();
                    assertNotNull(greeting);

                    // Executed only if the previous assertion is valid.
                    assertAll("Greeting length",
                            () -> assertTrue(greeting.length() > 1),
                            () -> assertTrue(greeting.length() < 13)
                    );
                }
        );
    }
}
