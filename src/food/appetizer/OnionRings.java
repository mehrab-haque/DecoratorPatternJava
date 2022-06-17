package food.appetizer;

import config.Constants;
import food.Food;
import food.decorator.FoodDecorator;

public class OnionRings extends FoodDecorator implements Appetizer{
    public OnionRings(Food newFood) {
        super(newFood);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+ Constants.PRICE_ONION_RINGS;
    }
}
