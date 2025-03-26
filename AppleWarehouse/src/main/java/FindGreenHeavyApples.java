public class FindGreenHeavyApples implements AppleSearchCriteria {
    @Override
    public boolean test(Apple apple) {

        FindGreenApple findGreenApple = new FindGreenApple();
        FindHeavyApples findHeavyApple = new FindHeavyApples();
        return (findGreenApple.test(apple) && findHeavyApple.test(apple));
    }
}