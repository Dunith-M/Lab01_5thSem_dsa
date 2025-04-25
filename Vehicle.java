import java.util.Scanner;

public class Vehicle {

    // (b) 1
    private String vehicleNumber;
    private Owner owner;
    private int registrationYear;

    public Vehicle(){
        this.vehicleNumber = " ";
        this.owner = new Owner();
        this.registrationYear = 0;
    }

    public Vehicle(String vehicleNumber, Owner owner, int registrationYear){
        this.vehicleNumber = vehicleNumber;
        this.owner = owner;
        this.registrationYear = registrationYear;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter vehicle number: ");
        this.vehicleNumber = scanner.nextLine();
        this.owner.input();
        System.out.print("Enter registration year: ");
        this.registrationYear = scanner.nextInt();
    }
}
