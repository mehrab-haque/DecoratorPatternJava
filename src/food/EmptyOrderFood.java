package food;

public class EmptyOrderFood implements Food{
    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String toString() {
        return "";
    }
}
