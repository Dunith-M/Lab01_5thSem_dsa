public class ThreeWheeler extends Vehicle {
    private String fuelType;

    public ThreeWheeler() {
        super();
    }

    public ThreeWheeler(String vehicleNo, Owner owner, int registeredYear, String fuelType) {
        super(vehicleNo, owner, registeredYear);
        this.fuelType = fuelType;
    }

    @Override
    public double getAmount() {
        if (fuelType.equalsIgnoreCase("diesel")) {
            return 850.0;
        } else {
            return 950.0;
        }
    }

    @Override
    public String toString() {
        return getOwner().toString() + "   [ThreeWheeler]-" + getVehicleNo() + "(" + getRegisteredYear() + ") Rs. " + getAmount();
    }
}
