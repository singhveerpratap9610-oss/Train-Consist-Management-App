import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("Luxury", 80));

        // Display bogies
        System.out.println("\nBogies:");
        bogies.forEach(System.out::println);

        // Calculate total capacity using map + reduce
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // Display total
        System.out.println("\nTotal Seating Capacity: " + totalCapacity);

        System.out.println("\nProgram continues...");
    }
}