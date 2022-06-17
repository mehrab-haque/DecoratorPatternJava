package food.burger;

import config.Constants;
import food.Food;
import food.decorator.FoodDecorator;

public class VeggiBurger extends FoodDecorator implements Burger{
    public VeggiBurger(Food newFood) {
        super(newFood);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+ Constants.PRICE_VEGGI_BURGER;
    }
}
