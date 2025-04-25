public class MotorCycle extends Vehicle {

    // constructor 
    public MotorCycle(){
        super();
    }

    // parameterized constructor
    public MotorCycle(String vehicleNumber, Owner owner, int registrationYear){
        super(vehicleNumber, owner, registrationYear);
    }

    
    public double getAmount() {
        return 700.00;
    }

    @Override
    public String toString() {
        return super.toString() + "    Rs. " + String.format("%.0f", getAmount());
    }
}