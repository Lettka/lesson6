package lesson6;

public class Cat extends Animal {

    private static int countCat;

    private static final int LIMIT_RUNNING = 200;


    public Cat(String name) {
        super(name);
        countCat++;
    }

    public void run(int distance) {
        if(distance <= LIMIT_RUNNING && distance > 0)
        System.out.printf("%s has run %d m.\n", name, distance);
        else System.out.printf("This cat can't run the distance %d\n", distance);
    }

    public static int getAmountCat(){
        return countCat;
    }

}
