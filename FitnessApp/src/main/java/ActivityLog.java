public class ActivityLog extends FitnessEntity {
    private final String activityType;

    public ActivityLog(String id, String activityType) {
        super(id);
        this.activityType = activityType;
    }

    @Override
    public String toString() {
        return "ActivityLog{id='" + getId() + "', activityType='" + activityType + "'}";
    }
}
