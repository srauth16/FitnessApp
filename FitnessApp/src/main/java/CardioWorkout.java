public class CardioWorkout extends Workout {
    private final int duration; // in minutes

    public CardioWorkout(String id, int duration) {
        super(id, "Cardio");
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "CardioWorkout{id='" + getId() + "', duration=" + duration + " mins}";
    }
}
