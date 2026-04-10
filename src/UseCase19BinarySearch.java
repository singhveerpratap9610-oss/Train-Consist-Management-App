import java.util.Arrays;

public class UseCase19BinarySearch {

    public static boolean binarySearch(String[] bogieIds, String key) {

        // Handle empty array
        if (bogieIds.length == 0) {
            return false;
        }

        // Sort first (important for binary search)
        Arrays.sort(bogieIds);

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int result = key.compareTo(bogieIds[mid]);

            if (result == 0) {
                return true;
            } else if (result < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] bogieIds = {"BG309", "BG101", "BG550", "BG205", "BG412"};
        String searchKey = "BG205";

        boolean found = binarySearch(bogieIds, searchKey);

        System.out.println("Sorted Bogie IDs: " + Arrays.toString(bogieIds));
        System.out.println("Search Result for " + searchKey + ": " + found);
    }
}