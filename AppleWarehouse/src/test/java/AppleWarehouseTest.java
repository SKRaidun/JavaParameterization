import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AppleWarehouseTest {

    FindGreenApple findGreenApple = new FindGreenApple();
    FindRedApple findRedApple = new FindRedApple();
    FindHeavyApples findHeavyApple = new FindHeavyApples();
    FindLightApples findLightApple = new FindLightApples();

    @Nested
    class Test1 {

        Apple greenApple = new Apple("green", 100);
        Apple redApple = new Apple("red", 200);
        @Test
        public void shouldFindGreenApples() {
            assertTrue(findGreenApple.test(greenApple));
        }

        @Test
        public void shouldNotFindGreenApples() {
            assertFalse(findGreenApple.test(redApple));
        }

        @Test
        public void shouldFindRedApples() {
            assertTrue(findRedApple.test(redApple));
        }

        @Test
        public void shouldNotFindRedApples() {
            assertFalse(findRedApple.test(greenApple));
        }

        @Test
        public void shouldFindHeavyApples() {
            assertTrue(findHeavyApple.test(redApple));
        }

        @Test
        public void shouldNotFindHeavyApples() {
            assertFalse(findHeavyApple.test(greenApple));
        }

        @Test
        public void shouldFindLightApples() {
            assertTrue(findLightApple.test(greenApple));
        }

        @Test
        public void shouldNotFindLightApples() {
            assertFalse(findLightApple.test(redApple));
        }
    }
}
