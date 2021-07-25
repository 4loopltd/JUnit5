package uk.co._4loop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

public class AssumptionTest {

    @Test
    void trueAssumption() {
        assumeTrue(5 > 1);
        assertEquals(5 + 2, 7);
    }

    @Test
    void falseAssumption() {
        assumeTrue("abc".contains("Z"));
        fail("test should have been aborted");
    }

    @Test
    void assumptionThat() {
        String someString = "Anythingwilldo";
        assumingThat(
                someString.equals("Anythingwilldo"),
                () -> assertEquals(2 + 2, 4)
        );
    }

}
