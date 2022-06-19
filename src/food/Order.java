package food;

import food.appetizer.Appetizer;
import food.appetizer.FrenchFries;
import food.appetizer.OnionRings;
import food.burger.BeefBurger;
import food.burger.Burger;
import food.burger.VeggiBurger;
import food.cheese.Cheese;
import food.drink.Coffee;
import food.drink.Coke;
import food.drink.Drink;
import food.drink.Water;

public class Order {
    private int menu;
    public Order(int menu){
        this.menu=menu;
    }

    public Food prepareMenu(){
        Food baseFood=(Food)new EmptyOrderFood();
        switch (menu){
            case 1:
                Burger beefBurger=new BeefBurger(baseFood);
                Appetizer frenchFry=new FrenchFries(beefBurger);
                Cheese cheese= new Cheese(frenchFry);
                return cheese;
            case 2:
                Burger veggiBurger=new VeggiBurger(baseFood);
                Appetizer onionRings=new OnionRings(veggiBurger);
                Drink water=new Water(onionRings);
                return water;
            case 3:
                veggiBurger = new VeggiBurger(baseFood);
                frenchFry=new FrenchFries(veggiBurger);
                Drink coke=new Coke(frenchFry);
                return coke;
            case 4:
                veggiBurger = new VeggiBurger(baseFood);
                onionRings=new OnionRings(veggiBurger);
                Drink coffee=new Coffee(onionRings);
                water=new Water(coffee);
                return water;
            case 5:
                beefBurger=new BeefBurger(baseFood);
                return beefBurger;
            default:
                return baseFood;
        }
    }
}
