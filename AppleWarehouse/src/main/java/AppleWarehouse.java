import java.util.ArrayList;
import java.util.List;

public class AppleWarehouse {
    private List<Apple> apples = getAllApples();

    private List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }

    public List<Apple> findApples(String appleColor) {

        List<Apple> foundApples = new ArrayList<>();

        for (Apple apple : apples) {
            String color = apple.getColor();
            if (color.equalsIgnoreCase(appleColor)) {
                foundApples.add(apple);
            }
        }
        return foundApples;
    }

    public List<Apple> findHeavyApples(int maxWeight) {

        List<Apple> heavyApples = new ArrayList<>();

        for (Apple apple : apples) {
            int weight = apple.getWeight();
            if (weight > maxWeight) {
                heavyApples.add(apple);
            }
        }
        return heavyApples;
    }

    public List<Apple> findAppleByCriteria(AppleSearchCriteria criteria) {
        List<Apple> resultApples = new ArrayList<>();

        for (Apple apple : apples) {
            if (criteria.test(apple)) {
                resultApples.add(apple);
            }
        }

        return resultApples;
    }
}
