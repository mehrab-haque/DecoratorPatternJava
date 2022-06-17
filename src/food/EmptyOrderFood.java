package food;

public class EmptyOrderFood implements Food{
    @Override
    public double getPrice() {
        return 0;
    }
}
