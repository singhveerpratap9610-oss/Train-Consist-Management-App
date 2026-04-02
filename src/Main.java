import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("Sleeper", 70));   // duplicate type for grouping
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("AC Chair", 55));

        // Display original list
        System.out.println("\nOriginal Bogies:");
        bogies.forEach(System.out::println);

        // Group bogies by type (name)
        Map<String, List<Bogie>> groupedBogies = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.name));

        // Display grouped result
        System.out.println("\nGrouped Bogies:");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("\nType: " + entry.getKey());
            entry.getValue().forEach(System.out::println);
        }

        System.out.println("\nProgram continues...");
    }
}