public class MotorCycle extends Vehicle {
    public MotorCycle() {
        super();
    }

    public MotorCycle(String vehicleNo, Owner owner, int registeredYear) {
        super(vehicleNo, owner, registeredYear);
    }

    @Override
    public double getAmount() {
        return 700.0;
    }

    @Override
    public String toString() {
        return getOwner().toString() + "   [MotorCycle]-" + getVehicleNo() + "(" + getRegisteredYear() + ") Rs. " + getAmount();
    }
}
