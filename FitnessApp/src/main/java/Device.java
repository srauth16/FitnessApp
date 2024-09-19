public abstract class Device extends FitnessEntity {
    protected final String brand; // Changed to protected to allow access in subclasses

    public Device(String id, String brand) {
        super(id);
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Device{id='" + getId() + "', brand='" + brand + "'}";
    }
}
