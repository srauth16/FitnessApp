public class StrengthWorkout extends Workout {
    private final int sets;

    public StrengthWorkout(String id, int sets) {
        super(id, "Strength");
        this.sets = sets;
    }

    @Override
    public String toString() {
        return "StrengthWorkout{id='" + getId() + "', sets=" + sets + "}";
    }
}
