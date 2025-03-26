public class FindRedApple implements AppleSearchCriteria{
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equalsIgnoreCase("red");
    }
}
