package lesson7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Tom", 10),
                new Cat("Barsik", 7),
                new Cat("Murka", 13),
                new Cat("Murzik", 15),
                new Cat("Aliska", 8)
        };

        Bowl bowl = new Bowl(35);
        for (Cat cat:
             cats) {
            cat.eat(bowl);
            System.out.println(cat);
            System.out.println();
        }

        bowl.addFoodToBowl(50);

        for (Cat cat:
                cats) {
            cat.eat(bowl);
            System.out.println(cat);
            System.out.println();
        }
    }
}
