public abstract class Workout extends FitnessEntity {
    private final String type;

    public Workout(String id, String type) {
        super(id);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Workout{id='" + getId() + "', type='" + type + "'}";
    }
}
