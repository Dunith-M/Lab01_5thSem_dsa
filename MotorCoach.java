import java.util.Scanner;

public class MotorCoach extends Vehicle{
    
    private String fuelType;
    private int numberOfSeats;

    public MotorCoach() {
        super();
        this.fuelType = "";
        this.numberOfSeats = 0;
    }

    public MotorCoach(String vehicleNumber, Owner owner, int registeredYear, String fuelType, int numberOfSeats) {
        super(vehicleNumber, owner, registeredYear);
        this.fuelType = fuelType;
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fuel Type: ");
        this.fuelType = scanner.nextLine();
        System.out.print("Number of Seats: ");
        this.numberOfSeats = scanner.nextInt();
    }

    
    public double getAmount() {
        return 2000.00;
    }

    @Override
    public String toString() {
        return super.toString() + "    Rs. " + String.format("%.0f", getAmount());
    }
}
