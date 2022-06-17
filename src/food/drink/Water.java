package food.drink;

import config.Constants;
import food.Food;
import food.decorator.FoodDecorator;

public class Water extends FoodDecorator implements Drink {
    public Water(Food newFood) {
        super(newFood);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+ Constants.PRICE_WATER;
    }
}
