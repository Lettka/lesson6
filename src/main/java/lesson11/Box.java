package lesson11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> fruits;
    private double weight;

    public Box() {
        fruits = new ArrayList<>();
    }

    public Box(List<T> fruits) {
        this.fruits = new ArrayList<>(fruits);
        for (T fruit :
                this.fruits) {
            weight += fruit.getWeight();
        }
    }

    public Box(T... fruits) {
        this.fruits = new ArrayList<>(Arrays.asList(fruits));
        for (T fruit :
                this.fruits) {
            weight += fruit.getWeight();
        }
    }

    public double getWeight() {
        return weight;
    }

    public boolean compare(Box<?> box) {
        return Math.abs(this.getWeight() - box.getWeight()) < 0.001;
    }

    public void add(T fruit) {
        fruits.add(fruit);
        weight += fruit.getWeight();
    }

    public void putToAnotherBox(Box<T> box) {
        box.fruits.addAll(fruits);
        box.weight += this.weight;
        fruits.clear();
        weight = 0;
    }
}
