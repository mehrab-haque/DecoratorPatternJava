package food.drink;

import config.Constants;
import food.Food;
import food.decorator.FoodDecorator;

public class Coke extends FoodDecorator implements Drink{
    public Coke(Food newFood) {
        super(newFood);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+ Constants.PRICE_COKE;
    }
}
