package food.appetizer;

import config.Constants;
import food.Food;
import food.decorator.FoodDecorator;

public class FrenchFries extends FoodDecorator implements Appetizer{
    public FrenchFries(Food newFood) {
        super(newFood);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+ Constants.PRICE_FRENCH_FRIES;
    }

    @Override
    public String toString() {
        return "French Fries\n"+super.toString();
    }
}
