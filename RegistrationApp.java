import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistrationApp {
    private int regCount;
    private Vehicle[] vehicles;

    public RegistrationApp() {
        vehicles = new Vehicle[50];
        regCount = 0;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select Vehicle Type: ");
        System.out.println("[1] MotorCycle\n[2] ThreeWheeler\n[3] MotorCoach");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        if (choice == 1) {
            MotorCycle mc = new MotorCycle();
            mc.input();
            vehicles[regCount++] = mc;
        } else if (choice == 2) {
            ThreeWheeler tw = new ThreeWheeler();
            tw.input();
            System.out.print("Enter Fuel Type (Diesel/Petrol): ");
            String fuel = sc.nextLine();
            tw = new ThreeWheeler(tw.getVehicleNo(), tw.getOwner(), tw.getRegisteredYear(), fuel);
            vehicles[regCount++] = tw;
        } else if (choice == 3) {
            MotorCoach mc = new MotorCoach();
            mc.input();
            System.out.print("Enter Fuel Type (Diesel/Petrol): ");
            String fuel = sc.nextLine();
            System.out.print("Enter No of Seats: ");
            int seats = sc.nextInt();
            mc = new MotorCoach(mc.getVehicleNo(), mc.getOwner(), mc.getRegisteredYear(), fuel, seats);
            vehicles[regCount++] = mc;
        } else {
            System.out.println("Invalid Vehicle Type.");
        }
    }

    public void printRegSummary() {
        System.out.println("-----------------------------------------------------------");
        System.out.println("Vehicle Registration System");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Owner          Vehicle                     Price");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < regCount; i++) {
            System.out.println(vehicles[i].toString());
        }
        System.out.println("-----------------------------------------------------------");
    }

    public void saveRegSummary() {
        try {
            FileWriter writer = new FileWriter("reginfo.txt");
            writer.write("-----------------------------------------------------------\n");
            writer.write("Vehicle Registration System\n");
            writer.write("-----------------------------------------------------------\n");
            writer.write("Owner          Vehicle                     Price\n");
            writer.write("-----------------------------------------------------------\n");
            for (int i = 0; i < regCount; i++) {
                writer.write(vehicles[i].toString() + "\n");
            }
            writer.write("-----------------------------------------------------------\n");
            writer.close();
            System.out.println("Successfully saved to reginfo.txt!");
        } catch (IOException e) {
            System.out.println("Error saving to file: " + e.getMessage());
        }
    }

    public void printCacheBalance() {
        double total = 0;
        for (int i = 0; i < regCount; i++) {
            total += vehicles[i].getAmount();
        }
        System.out.println("-------------------------------------");
        System.out.println("Number of Registrations  : " + regCount);
        System.out.println("Total Balance (Rs)  : " + total);
        System.out.println("-------------------------------------");
    }
}
