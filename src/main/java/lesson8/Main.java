package lesson8;

public class Main {
    public static void main(String[] args) {
        Participant[] participants = {
                new Human("Ivan", 23, 5),
                new Human("Vasya", 50, 10),
                new Cat("Tom", 10, 13),
                new Cat("Murka", 5, 7),
                new Robot("Robot1", 1000, 25),
                new Robot("Robot2", 100, 150),
        };
        Obstacle[] obstacles = {
                new Treadmill(3),
                new Treadmill(5),
                new Wall(10),
                new Treadmill(20),
                new Wall(13),
                new Wall(20),
                new Treadmill(35),
                new Wall(30),
                new Treadmill(100),
        };

        for (Participant p:
             participants) {
            for (Obstacle o:
                 obstacles) {
                if(!o.overcome(p))
                    break;
            }
            System.out.println();
        }
    }
}
