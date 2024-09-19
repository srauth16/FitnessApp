public class WearableDevice extends Device {
    private final String model;

    public WearableDevice(String id, String brand, String model) {
        super(id, brand);
        this.model = model;
    }

    @Override
    public String toString() {
        return "WearableDevice{id='" + getId() + "', brand='" + brand + "', model='" + model + "'}";
    }
}
