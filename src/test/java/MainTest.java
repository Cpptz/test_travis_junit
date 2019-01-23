import static org.junit.jupiter.api.Assertions.assertEquals;

import main.Main;
import main.Main.*;

import org.junit.jupiter.api.*;
class MainTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test() {
        assertEquals(Main.some_function(),5);
    }
}