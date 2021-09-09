package lesson6;

public abstract class Animal {
    private static int countAnimal;

    protected String name;

    public Animal(String name){
        this.name = name;
        countAnimal++;
    }

    public abstract void run(int distance);

    public static int getAmountAnimal(){
        return countAnimal;
    }

}
