public class UseCase18LinearSearch {

    public static void main(String[] args) {

        // Step 1: Create array of bogie IDs
        String[] bogieIds = {"BG101", "BG205", "BG309", "BG412", "BG550"};

        // Step 2: Search key
        String searchId = "BG309";

        boolean found = false;

        // Step 3: Linear Search
        for (int i = 0; i < bogieIds.length; i++) {
            if (bogieIds[i].equals(searchId)) {
                found = true;
                break; // stop early when found
            }
        }

        // Step 4: Display result
        if (found) {
            System.out.println("Bogie ID " + searchId + " found in the train.");
        } else {
            System.out.println("Bogie ID " + searchId + " NOT found.");
        }
    }
}