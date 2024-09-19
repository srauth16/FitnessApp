public abstract class Goal extends FitnessEntity {
    private final String goalType;

    public Goal(String id, String goalType) {
        super(id);
        this.goalType = goalType;
    }

    @Override
    public String toString() {
        return "Goal{id='" + getId() + "', goalType='" + goalType + "'}";
    }
}
