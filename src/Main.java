import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<Bogie> bogies = new ArrayList<>();

        try {
            // Valid bogie
            bogies.add(new Bogie("Sleeper", 72));

            // Invalid bogie (will throw exception)
            bogies.add(new Bogie("AC Chair", 0));

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display valid bogies only
        System.out.println("\nValid Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nProgram continues...");
    }
}