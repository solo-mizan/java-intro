import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter your Phone number: ");
        long phoneNumber = input.nextLong();


        System.out.println("Customer details: \nName: " + name);
        System.out.println("Phone number: " + phoneNumber);

        input.close();
    }
}
