import java.util.Scanner;
public class StudentDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student s1 = new Student();

        // Get and set student ID
        System.out.print("Enter Student ID (9 digits): ");
        int id = scanner.nextInt();
        while (!s1.setId(id)) {
            System.out.println("Invalid ID! Please enter a 9-digit ID.");
            id = scanner.nextInt();
        }

        // Get and set student Name
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        while (!s1.setName(name)) {
            System.out.println("Invalid Name! Please enter a valid name with alphabetic characters only.");
            name = scanner.nextLine();
        }

        // Get and set student Gender
        System.out.print("Enter Student Gender (M/F): ");
        char gender = scanner.next().charAt(0);
        while (!s1.setGender(gender)) {
            System.out.println("Invalid Gender! Please enter 'M' or 'F'.");
            gender = scanner.next().charAt(0);
        }

        // Get and set student Department
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter Student Department (BCA, BBA, CE, CSE, ECE, EEE, ECS, ME, PE, MCA): ");
        String department = scanner.nextLine();
        while (!s1.setDepartment(department)) {
            System.out.println("Invalid Department! Please enter a valid department.");
            department = scanner.nextLine();
        }

        // Display the student information
        System.out.println("\nStudent Information:");
        System.out.println(s1);

        scanner.close();
    }
}