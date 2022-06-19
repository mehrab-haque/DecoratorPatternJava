import food.EmptyOrderFood;
import food.Food;
import food.Order;
import food.appetizer.Appetizer;
import food.appetizer.FrenchFries;
import food.burger.BeefBurger;
import food.burger.Burger;
import food.cheese.Cheese;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Food emptyFood= new EmptyOrderFood();

        Cheese cheese=new Cheese(emptyFood);
        Appetizer appetizer=new FrenchFries(cheese);
        Burger burger=new BeefBurger(appetizer);

        System.out.println(burger);

        while(true){
            System.out.println("Choose a menu (enter -1 to exit) :");
            System.out.println("1. Beef burger with French fry and cheese ");
            System.out.println("2. Veggi Burger with onion rings and Bottle of Water");
            System.out.println("3. A combo meal with Veggi burger, French Fry and Coke");
            System.out.println("4. A combo meal with Veggi burger, Onion Rings, Coffee and Water");
            System.out.println("5. A Beef burger only");
            System.out.println();
            Scanner scanner=new Scanner(System.in);
            int menu=scanner.nextInt();
            if(menu==-1)
                break;
            else{
                Order order=new Order(menu);
                System.out.print(order.prepareMenu());
                System.out.println("Total price : "+order.prepareMenu().getPrice());
                System.out.println();
            }
        }

    }
}
