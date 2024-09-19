public class FitnessApp {
    public static void main(String[] args) {
        User user = new User("U001", "Alice");
        CardioWorkout cardio = new CardioWorkout("W001", 30);
        StrengthWorkout strength = new StrengthWorkout("W002", 5);
        WearableDevice wearable = new WearableDevice("D001", "Fitbit", "Charge 4");
        Smartphone smartphone = new Smartphone("D002", "Apple", "iOS");

        System.out.println(user);
        System.out.println(cardio);
        System.out.println(strength);
        System.out.println(wearable);
        System.out.println(smartphone);
    }
}
