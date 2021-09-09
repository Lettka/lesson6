package lesson6;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Tom"),
                new Dog("Goofy"),
                new Dog("Balto"),
                new Cat("Garfield"),
                new Dog("Pongo")
        };
        for (Animal animal :
                animals) {
            System.out.println(animal.name);
            animal.run((int) (Math.random() * 501));
            if (animal instanceof Dog) ((Dog) animal).swim((int) (Math.random() * 15));
            else System.out.println("This animal can't swim");
        }
        System.out.printf("Amount of animals: %d\nAmount of cats: %d\nAmount of dogs: %d\n",
                Animal.getAmountAnimal(), Cat.getAmountCat(), Dog.getAmountDog());
    }
}
