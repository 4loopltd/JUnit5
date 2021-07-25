package uk.co._4loop;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class AssumptionTest {

    @BeforeAll
    static void initialise(){
        System.setProperty("ENV", "DEV");
    }

    @Test
    void testWithTrueAssumption() {
        assumeTrue(5 > 1);
        assertEquals(5 + 2, 7);
    }

    @Test
    void testWithFalseAssumption() {
        assumeTrue("abc".contains("Z"));
        fail("test should have been aborted");
    }

    @Test
    void testWithAssumptionThat() {
        String someString = "Anythingwilldo";
        assumingThat(
                someString.equals("Anythingwilldo"),
                () -> assertEquals(2 + 2, 4)
        );
    }

    @Test
    void testOnlyOnCiServer() {
        assumeTrue("CI".equals(System.getProperty("ENV")),
                () -> "Aborting test: not in integration environment");
        // remainder of test
    }

    @Test
    void testOnlyOnDeveloperWorkstation() {
        assumeTrue("DEV".equals(System.getProperty("ENV")),
                () -> "Aborting test: not on developer workstation");
        // remainder of test
    }

}
