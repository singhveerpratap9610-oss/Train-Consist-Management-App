import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of goods bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Open", "Coal"));
        goodsBogies.add(new GoodsBogie("Box", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // Display bogies
        System.out.println("\nGoods Bogies:");
        goodsBogies.forEach(System.out::println);

        // Safety validation using allMatch()
        boolean isSafe = goodsBogies.stream()
                .allMatch(b -> {
                    if (b.type.equals("Cylindrical")) {
                        return b.cargo.equals("Petroleum");
                    }
                    return true; // other bogies allowed
                });

        // Display result
        if (isSafe) {
            System.out.println("\nTrain is SAFE for operation ✅");
        } else {
            System.out.println("\nTrain is NOT SAFE ❌");
        }

        System.out.println("\nProgram continues...");
    }
}