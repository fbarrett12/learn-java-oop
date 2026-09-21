import java.util.Scanner;

public class SpeedingTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double speedLimit = 65.0;

        System.out.println("Enter your speed: ");
        double speed = Double.valueOf(scanner.nextLine());

        if (speed > speedLimit) {
            System.out.println("You are speeding! You will receive a ticket.");
        }
        else {
            System.out.println("You are within the speed limit. Drive safely!");
        }
    }
}