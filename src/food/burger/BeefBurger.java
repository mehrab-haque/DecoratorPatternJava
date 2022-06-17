package food.burger;

import config.Constants;
import food.Food;
import food.decorator.FoodDecorator;

public class BeefBurger extends FoodDecorator implements Burger {
    public BeefBurger(Food newFood) {
        super(newFood);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+ Constants.PRICE_BEEF_BURGER;
    }
}
