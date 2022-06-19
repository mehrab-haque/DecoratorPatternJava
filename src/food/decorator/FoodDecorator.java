package food.decorator;

import food.Food;

public abstract class FoodDecorator implements Food {

    Food newFood;

    public FoodDecorator(Food newFood){
        this.newFood=newFood;
    }

    @Override
    public double getPrice() {
        return newFood.getPrice();
    }

    @Override
    public String toString() {
        return newFood.toString();
    }
}
