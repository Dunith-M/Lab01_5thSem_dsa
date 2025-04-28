public class Owner {
    private String name;
    private String address;
    private String nic;

    public Owner() {}

    public Owner(String name, String address, String nic) {
        this.name = name;
        this.address = address;
        this.nic = nic;
    }

    public void input() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Address: ");
        address = sc.nextLine();
        System.out.print("Enter NIC: ");
        nic = sc.nextLine();
    }

    @Override
    public String toString() {
        return name.toUpperCase() + " (" + nic + ")";
    }
}
