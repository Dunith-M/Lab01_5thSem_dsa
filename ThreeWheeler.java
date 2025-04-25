import java.util.Scanner;

public class ThreeWheeler extends Vehicle{

    private String fuelType;

    // constructor
    public ThreeWheeler(){
        super();
        this.fuelType = "Petrol";
    }

    public ThreeWheeler(String vehicleNumber, Owner owner, int registrationYear, String fuelType){
        super(vehicleNumber, owner, registrationYear);
        this.fuelType = fuelType;
    }

     @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fuel Type: ");
        this.fuelType = scanner.nextLine();
    }

    public double getAmount() {
        return 850.00;
    }

    @Override
    public String toString() {
        return super.toString() + "   Rs. " + String.format("%.0f", getAmount());
    }
    
}
