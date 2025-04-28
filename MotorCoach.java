public class MotorCoach extends Vehicle {
    private String fuelType;
    private int noOfSeats;

    public MotorCoach() {
        super();
    }

    public MotorCoach(String vehicleNo, Owner owner, int registeredYear, String fuelType, int noOfSeats) {
        super(vehicleNo, owner, registeredYear);
        this.fuelType = fuelType;
        this.noOfSeats = noOfSeats;
    }

    @Override
    public double getAmount() {
        if (fuelType.equalsIgnoreCase("diesel")) {
            return 500.0 * noOfSeats;
        } else {
            return 400.0 * noOfSeats;
        }
    }

    @Override
    public String toString() {
        return getOwner().toString() + "   [MotorCoach]-" + getVehicleNo() + "(" + getRegisteredYear() + ") Rs. " + getAmount();
    }
}
