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
            List<Apple> greenApples = appleWarehouse.findApples();
            int green = 0;
            for (Apple apple : greenApples) {
                if (apple.getColor().equalsIgnoreCase("green")) {green += 1;}
            }
            assertEquals(green, 3);
        }

        @Test
        public void shouldFindRedApples() {
            List<Apple> redApples = appleWarehouse.findApples();
            int red = 0;
            for (Apple apple : redApples) {
                if (apple.getColor().equalsIgnoreCase("red")) {red += 1;}
            }
            assertEquals(red, 3);
        }
    }
}
