import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for ordered + unique bogies
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Add bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Add duplicate intentionally
        trainFormation.add("Sleeper");

        // Display final formation
        System.out.println("\nFinal Train Formation (No duplicates, order preserved):");
        System.out.println(trainFormation);

        System.out.println("\nTotal bogies: " + trainFormation.size());
    }
}