package lesson8;

public class Treadmill implements Obstacle{
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Participant participant) {
        if (participant.run(length)) {
            System.out.printf("%s: %s overcome %d m treadmill.\n", participant.getClass().getSimpleName(), participant.getName(), length);
            return true;
        } else {
            System.out.printf("%s: %s can't overcome %d m treadmill.\n", participant.getClass().getSimpleName(), participant.getName(), length);
            return false;
        }
    }
}
