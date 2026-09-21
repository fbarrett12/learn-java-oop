import java.util.Scanner;

public class ReadingIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("You entered: " + number);
    }
}