import food.EmptyOrderFood;
import food.Food;
import food.appetizer.Appetizer;
import food.appetizer.FrenchFries;
import food.burger.BeefBurger;
import food.burger.Burger;
import food.cheese.Cheese;

public class Main{
    public static void main(String[] args) {

        Food emptyFood= new EmptyOrderFood();

        Cheese cheese=new Cheese(emptyFood);
        Appetizer appetizer=new FrenchFries(cheese);
        Burger burger=new BeefBurger(appetizer);

        System.out.println(burger.getPrice());

    }
}
