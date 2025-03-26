public class FindGreenApple implements AppleSearchCriteria{
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equalsIgnoreCase("green");
    }
}
