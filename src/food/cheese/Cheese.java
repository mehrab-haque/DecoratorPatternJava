package food.cheese;

import config.Constants;
import food.Food;
import food.decorator.FoodDecorator;

public class Cheese extends FoodDecorator implements Food {
    public Cheese(Food newFood) {
        super(newFood);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+ Constants.PRICE_CHEESE;
    }

    @Override
    public String toString() {
        return "Cheese\n"+super.toString();
    }
}
