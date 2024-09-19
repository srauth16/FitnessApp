public abstract class FitnessEntity {
    private final String id;

    public FitnessEntity(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "FitnessEntity{id='" + id + "'}";
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        FitnessEntity that = (FitnessEntity) obj;
        return id.equals(that.id);
    }
}
