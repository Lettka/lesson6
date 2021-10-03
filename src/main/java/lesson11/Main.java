package lesson11;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        Apple[] apples = {new Apple(1.1), new Apple(1.2), new Apple(1.3), new Apple(1.4)};
        System.out.println(Arrays.toString(apples));
        replaceElements(apples, 1, 3);
        System.out.println(Arrays.toString(apples));
        System.out.println("\nTask2-3");
        Box<Apple> box1 = new Box<>(arrayToArrayList(apples));
        Box<Orange> box2 = new Box();
        Box<Apple> box3 = new Box<>(new Apple(1.4));
        box2.add(new Orange(1.5));
        box2.add(new Orange(1.7));
        box2.add(new Orange(1.9));
        box2.add(new Orange(1.3));
        System.out.printf("weight box1 = %.2f\n", box1.getWeight());
        System.out.printf("weight box2 = %.2f\n", box2.getWeight());
        System.out.printf("weight box3 = %.2f\n", box3.getWeight());
        System.out.println("Equal box1 and box2: " + box1.compare(box2));
        box1.putToAnotherBox(box3);
        System.out.printf("weight box1 = %.2f\n", box1.getWeight());
        System.out.printf("weight box2 = %.2f\n", box2.getWeight());
        System.out.printf("weight box3 = %.2f\n", box3.getWeight());
        System.out.println("Equal box2 and box3: " + box2.compare(box3));

    }

    private static void replaceElements(Object[] arr, int index1, int index2) {
        Object element = arr[index1 - 1];
        arr[index1 - 1] = arr[index2 - 1];
        arr[index2 - 1] = element;
    }

    private static <T> ArrayList<T> arrayToArrayList(T[] array) {
        return new ArrayList<T>(Arrays.asList(array));
    }

}
