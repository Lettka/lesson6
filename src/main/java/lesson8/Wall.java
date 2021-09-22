package lesson8;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public boolean overcome(Participant participant) {
        if (participant.jump(height)) {
            System.out.printf("%s: %s overcome %d m wall.\n", participant.getClass().getSimpleName(), participant.getName(), height);
            return true;
        } else {
            System.out.printf("%s: %s can't overcome %d m wall.\n", participant.getClass().getSimpleName(), participant.getName(), height);
            return false;
        }
    }
}
