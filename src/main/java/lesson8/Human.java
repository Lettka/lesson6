package lesson8;

public class Human implements Participant {
    private int maxRunDistance;
    private int maxJumpHeight;
    private String name;

    public Human(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public boolean run(int distance) {
        return maxRunDistance >= distance;
    }

    public boolean jump(int height) {
        return maxJumpHeight >= height;
    }

    @Override
    public String getName() {
        return name;
    }
}
