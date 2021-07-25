package uk.co._4loop;

import org.junit.jupiter.api.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class AssertionTest {

    @Test
    void lambdaExpression() {
        assertTrue(Stream.of(1, 2, 3)
                .mapToInt(i -> i)
                .sum() > 5, () -> "Sum should be > 5");
    }

    @Test
    void groupAssertion() {
        int[] numbers = {0, 1, 2, 3, 4};
        assertAll("numbers",
                () -> assertEquals(0,numbers[0]),
                () -> assertEquals(3,numbers[3]),
                () -> assertEquals(1,numbers[4])
        );
    }
}
