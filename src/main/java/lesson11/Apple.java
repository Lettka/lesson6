package lesson11;

public class Apple extends Fruit {
    public static int count;
    private int id;

    public Apple(double weight) {
        super(weight);
        count++;
        id = count;
    }

    @Override
    public String toString() {
        return "Apple" + id;
    }
}
