import java.util.Arrays;

public class UseCase19BinarySearch {

    public static void main(String[] args) {

        // Step 1: Create array (can be unsorted)
        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};

        // Step 2: Sort the array (IMPORTANT for Binary Search)
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs: " + Arrays.toString(bogieIds));

        // Step 3: Search key
        String searchId = "BG309";

        boolean found = binarySearch(bogieIds, searchId);

        // Step 4: Display result
        if (found) {
            System.out.println("Bogie ID " + searchId + " found.");
        } else {
            System.out.println("Bogie ID " + searchId + " NOT found.");
        }
    }

    // Binary Search Method
    public static boolean binarySearch(String[] arr, String key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = arr[mid].compareTo(key);

            if (comparison == 0) {
                return true; // found
            } else if (comparison < 0) {
                low = mid + 1; // search right
            } else {
                high = mid - 1; // search left
            }
        }

        return false; // not found
    }
}