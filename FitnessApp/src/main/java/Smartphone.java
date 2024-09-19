public class Smartphone extends Device {
    private final String os;

    public Smartphone(String id, String brand, String os) {
        super(id, brand);
        this.os = os;
    }

    @Override
    public String toString() {
        return "Smartphone{id='" + getId() + "', brand='" + brand + "', os='" + os + "'}";
    }
}
