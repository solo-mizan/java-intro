/**
 * TakeInputFromUser
 */
import java.util.Scanner;

public class TakeInputFromUser {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter your phone number: ");
        long phoneNumber = input.nextLong();

        System.out.println("\nCustomer details: \nName: " + name);
        System.out.println("Phone number: " + phoneNumber);
    }
}