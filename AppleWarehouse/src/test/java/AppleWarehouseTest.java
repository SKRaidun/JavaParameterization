import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AppleWarehouseTest {

    AppleWarehouse appleWarehouse = new AppleWarehouse();

    @Nested
    class Test1 {

        @Test
        public void shouldFindGreenApples() {
            List<Apple> greenApples = appleWarehouse.findApples("green");
            assertEquals(greenApples.size(), 3);
        }

        @Test
        public void shouldFindRedApples() {
            List<Apple> redApples = appleWarehouse.findApples("red");
            assertEquals(redApples.size(), 3);
        }

        @Test
        public void shouldFindHeavyApples() {
            List<Apple> heavyApples = appleWarehouse.findHeavyApples(99);
            assertEquals(heavyApples.size(), 5);
        }
    }
}
