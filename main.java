import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        RegistrationApp app = new RegistrationApp();
        Scanner sc = new Scanner(System.in);
        int option;

        do {
            System.out.println("-------------------------------------");
            System.out.println("Vehicle Registration System");
            System.out.println("-------------------------------------");
            System.out.println("              MAIN MENU");
            System.out.println("=====================================");
            System.out.println("[1] Add New Registration");
            System.out.println("[2] Print Registration summary");
            System.out.println("[3] Save Registration summary");
            System.out.println("[4] Print cache balance");
            System.out.println("[5] Exit");
            System.out.print("Enter your option [1-5]: ");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    app.input();
                    break;
                case 2:
                    app.printRegSummary();
                    break;
                case 3:
                    app.saveRegSummary();
                    break;
                case 4:
                    app.printCacheBalance();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid Option!");
            }
        } while (option != 5);
    }
}
