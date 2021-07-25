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
    void testSuccess(){
        System.out.println("DisplayName");
    }

    @Test
    @DisplayName("╯°□°）╯")
    void testWithDisplayNameSpecialCharacters() {
        System.out.println("SpecialCharacters");
    }

    @Test
    @DisplayName("😱")
    void testWithDisplayNameEmoji() {
    }

    @Test
    void testFailed() {
        fail("a failing test");
    }

    @Disabled("Not Implemented")
    @Test
    void testDisabled(){
        System.out.println("Disabled");
    }

}
