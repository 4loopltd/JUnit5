package uk.co._4loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionTest {

    @Test
    void testShouldThrowException() {
        Throwable exception = assertThrows(UnsupportedOperationException.class, () -> {
            throw new UnsupportedOperationException("Not supported");
        });
        assertEquals(exception.getMessage(), "Not supported");
    }

    @Test
    void testAssertThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Integer.valueOf(null);
        });
    }
}
