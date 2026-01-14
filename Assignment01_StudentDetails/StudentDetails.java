import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Percentage: ");
        float percentage = sc.nextFloat();

        System.out.println("\n--- Student Details ---");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Percentage : " + percentage + "%");

        sc.close();
    }
}
