import java.util.ArrayList;     // !Required for storing multiple objects
import java.util.Scanner;       // !Required for user input

public class Main {
    // !Requirements: Using ArrayLists to store multiple objects for persistence
    private static ArrayList<Pet> petList = new ArrayList<>();
    private static ArrayList<Owner> ownerList = new ArrayList<>();
    private static ArrayList<Veterinarian> vetList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // !Initial test data to show the system works immediately
        seedData();

        boolean running = true;
        // !Main loop that keeps the application running
        while (running) {
            displayMenu();

            int choice = -1;
            // !Validating that the user enters a number
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Clear scanner buffer
            } else {
                scanner.nextLine(); // Clear invalid non-integer input
                System.out.println("Error: Please enter a valid menu number!");
                continue;
            }

            // !Menu logic using switch-case
            switch (choice) {
                case 1: addPet(); break;
                case 2: viewAllPets(); break;
                case 3: addOwner(); break;
                case 4: viewAllOwners(); break;
                case 5: addVet(); break;
                case 6: viewAllVets(); break;
                case 0:
                    System.out.println("Exiting System... Goodbye! ✅");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    // Helper method to populate the system with initial data
    private static void seedData() {
        petList.add(new Pet(1, "Buddy", "Dog", 5));
        ownerList.add(new Owner(101, "Ivan Ivanov", "+77071112233", 1));
        vetList.add(new Veterinarian(501, "Dr. Akhmetov", "Surgery", 8));
    }
    // !formatted console menu
    private static void displayMenu() {
        System.out.println("\n===== VET CLINIC SYSTEM MENU =====");
        System.out.println("1. Add New Pet");
        System.out.println("2. View All Pets");
        System.out.println("3. Add New Owner");
        System.out.println("4. View All Owners");
        System.out.println("5. Add New Veterinarian");
        System.out.println("6. View All Veterinarians");
        System.out.println("0. Exit");
        System.out.print("Select an option: ");
    }

    // !Logic to register a new pet from console
    private static void addPet() {
        System.out.print("Enter ID: "); int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: "); String name = scanner.nextLine();
        System.out.print("Enter Species: "); String spec = scanner.nextLine();
        System.out.print("Enter Age: "); int age = scanner.nextInt();
        scanner.nextLine();

        petList.add(new Pet(id, name, spec, age));
        System.out.println("Pet added successfully! ✅");
    }

    // !Logic to display all registered pets
    private static void viewAllPets() {
        System.out.println("\n--- REGISTERED PETS ---");
        if (petList.isEmpty()) System.out.println("No pets found.");
        for (Pet p : petList) System.out.println(p + " | Stage: " + p.getLifeStage());
    }

    // Logic to register a new owner from console
    private static void addOwner() {
        System.out.print("Enter ID: "); int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: "); String name = scanner.nextLine();
        System.out.print("Enter Phone: "); String phone = scanner.nextLine();
        System.out.print("Enter Number of Pets: "); int num = scanner.nextInt();
        scanner.nextLine();

        ownerList.add(new Owner(id, name, phone, num));
        System.out.println("Owner added successfully! ✅");
    }

    private static void viewAllOwners() {
        System.out.println("\n--- REGISTERED OWNERS ---");
        if (ownerList.isEmpty()) System.out.println("No owners found.");
        for (Owner o : ownerList) System.out.println(o + " | Frequent Client: " + o.isFrequentClient());
    }

    // Logic to register a new vet from console
    private static void addVet() {
        System.out.print("Enter ID: "); int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: "); String name = scanner.nextLine();
        System.out.print("Enter Specialization: "); String spec = scanner.nextLine();
        System.out.print("Enter Exp (years): "); int exp = scanner.nextInt();
        scanner.nextLine();

        vetList.add(new Veterinarian(id, name, spec, exp));
        System.out.println("Doctor registered successfully! ✅");
    }

    private static void viewAllVets() {
        System.out.println("\n--- LIST OF DOCTORS ---");
        if (vetList.isEmpty()) System.out.println("No doctors found.");
        for (Veterinarian v : vetList) System.out.println(v + " | Experienced: " + v.isExperienced());
    }
}