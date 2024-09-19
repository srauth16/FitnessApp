public class StepGoal extends Goal {
    private final int stepCount;

    public StepGoal(String id, int stepCount) {
        super(id, "Steps");
        this.stepCount = stepCount;
    }

    @Override
    public String toString() {
        return "StepGoal{id='" + getId() + "', stepCount=" + stepCount + " steps}";
    }
}
