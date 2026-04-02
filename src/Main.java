import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Train train = new Train();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Train Consist Management ---");
            System.out.println("1. Add Coach");
            System.out.println("2. Remove Coach");
            System.out.println("3. Display Train");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Coach ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Coach Type: ");
                    String type = sc.next();
                    train.addCoach(id, type);
                    break;

                case 2:
                    System.out.print("Enter Coach ID to remove: ");
                    int removeId = sc.nextInt();
                    train.removeCoach(removeId);
                    break;

                case 3:
                    train.displayTrain();
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}