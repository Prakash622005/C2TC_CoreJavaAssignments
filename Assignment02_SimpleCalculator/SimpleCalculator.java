import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Divide");
        System.out.print("Choose operation: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result: " + (a + b));
                break;
            case 2:
                System.out.println("Result: " + (a - b));
                break;
            case 3:
                System.out.println("Result: " + (a * b));
                break;
            case 4:
                System.out.println("Result: " + (a / b));
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
