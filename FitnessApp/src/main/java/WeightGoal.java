public class WeightGoal extends Goal {
    private final double targetWeight;

    public WeightGoal(String id, double targetWeight) {
        super(id, "Weight");
        this.targetWeight = targetWeight;
    }

    @Override
    public String toString() {
        return "WeightGoal{id='" + getId() + "', targetWeight=" + targetWeight + " kg}";
    }
}
