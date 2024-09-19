public class User extends FitnessEntity {
    private final String name;

    public User(String id, String name) {
        super(id);
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{id='" + getId() + "', name='" + name + "'}";
    }
}
