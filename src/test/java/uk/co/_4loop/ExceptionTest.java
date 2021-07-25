package uk.co._4loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ExceptionTest {

    @Test
    void shouldThrowException() {
        Throwable exception = assertThrows(UnsupportedOperationException.class, () -> {
            throw new UnsupportedOperationException("Not supported");
        });
        assertEquals(exception.getMessage(), "Not supported");
    }

    @Test
    void assertThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            Integer.valueOf(null);
        });
    }
}
