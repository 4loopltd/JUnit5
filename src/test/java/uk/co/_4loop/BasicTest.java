package uk.co._4loop;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.fail;

class BasicTest {

    @BeforeAll
    static void initialise(){
        System.out.println("BeforeAll Initialise");
    }

    @BeforeEach
    void setUp() {
        System.out.println("BeforeEach setUp");
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearDown AfterEach");
    }

    @AfterAll
    static void dispose(){
        System.out.println("AfterAll Dispose");
    }

    @DisplayName("A passing test")
    @Test
    void successTest(){
        System.out.println("Success");
    }

    @Test
    void failedTest() {
        fail("a failing test");
    }

    @Disabled("Not Implemented")
    @Test
    void disabledTest(){
        System.out.println("Disabled");
    }

}
