package lesson6;

public class Dog extends Animal {
    private static final int LIMIT_RUNNING = 500;
    private static final int LIMIT_SWIMMING = 10;
    private static int countDog;

    public Dog(String name) {
        super(name);
        countDog++;
    }

    public void run(int distance) {
        if(distance <= LIMIT_RUNNING && distance > 0)
            System.out.printf("%s has run %d m.\n", name, distance);
        else System.out.printf("This dog can't run the distance %d\n", distance);
    }

    public void swim(int distance){
        if(distance <= LIMIT_SWIMMING && distance > 0)
            System.out.printf("%s has swum %d m.\n", name, distance);
        else System.out.printf("This dog can't swim the distance %d\n", distance);
    }

    public static int getAmountDog(){
        return countDog;
    }
}
