package food.burger;

import config.Constants;
import food.Food;
import food.decorator.FoodDecorator;

public class ChickenBurger extends FoodDecorator implements Burger{
    public ChickenBurger(Food newFood) {
        super(newFood);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+ Constants.PRICE_CHICKEN_BURGER;
    }
}
