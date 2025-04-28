public class Vehicle {
    private String vehicleNo;
    private Owner owner;
    private int registeredYear;

    public Vehicle() {
        owner = new Owner();
    }

    public Vehicle(String vehicleNo, Owner owner, int registeredYear) {
        this.vehicleNo = vehicleNo;
        this.owner = owner;
        this.registeredYear = registeredYear;
    }

    public void input() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter Vehicle Number: ");
        vehicleNo = sc.nextLine();
        owner.input();
        System.out.print("Enter Registered Year: ");
        registeredYear = sc.nextInt();
    }

    public Owner getOwner() { return owner; }
    public String getVehicleNo() { return vehicleNo; }
    public int getRegisteredYear() { return registeredYear; }

    public double getAmount() { return 0; }
}
