import java.util.Scanner;

public class Owner {
    // (a)  1
    private String name, address, NIC;

    // (a) 2
    // default constructor + parameterized constructor
    public Owner() {
        this.name = "";
        this.address = "";
        this.NIC = "";
    }

    public Owner(String name, String address, String NIC){
        this.name = name;
        this.address = address;
        this.NIC = NIC;
    }

    // (a) 3
    @Override
    public String toString() {
        return name.toUpperCase() + " (" + NIC + ")";
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter address: ");
        this.address = scanner.nextLine();
        System.out.print("Enter NIC: ");
        this.NIC = scanner.nextLine();
    }
}
