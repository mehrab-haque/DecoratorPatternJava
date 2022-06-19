package food.drink;

import config.Constants;
import food.Food;
import food.decorator.FoodDecorator;

public class Coffee extends FoodDecorator implements Drink{
    public Coffee(Food newFood) {
        super(newFood);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+ Constants.PRICE_COFFE;
    }

    @Override
    public String toString() {
        return "Coffee\n"+super.toString();
    }
}
