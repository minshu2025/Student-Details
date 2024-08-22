import java.util.Scanner;

public class StudentDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for the number of students they want to create
        System.out.print("How many students do you want to enter? ");
        int numStudents = scanner.nextInt();

        // Create an array to hold the number of Student objects specified by the user
        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            students[i] = new Student(); // Instantiate each Student object

            System.out.println("\nEnter details for Student " + (i + 1) + ":");

            // Get and set student ID
            System.out.print("Enter Student ID (9 digits): ");
            int id = scanner.nextInt();
            while (!students[i].setId(id)) {
                System.out.println("Invalid ID! Please enter a 9-digit ID.");
                id = scanner.nextInt();
            }

            // Get and set student Name
            scanner.nextLine(); // Consume the newline character
            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();
            while (!students[i].setName(name)) {
                System.out.println("Invalid Name! Please enter a valid name with alphabetic characters only.");
                name = scanner.nextLine();
            }

            // Get and set student Gender
            System.out.print("Enter Student Gender (M/F): ");
            char gender = scanner.next().charAt(0);
            while (!students[i].setGender(gender)) {
                System.out.println("Invalid Gender! Please enter 'M' or 'F'.");
                gender = scanner.next().charAt(0);
            }

            // Get and set student Department
            scanner.nextLine(); // Consume the newline character
            System.out.print("Enter Student Department (BCA, BBA, CE, CSE, ECE, EEE, ECS, ME, PE, MCA): ");
            String department = scanner.nextLine();
            while (!students[i].setDepartment(department)) {
                System.out.println("Invalid Department! Please enter a valid department.");
                department = scanner.nextLine();
            }
        }

        // Display information of all students entered by the user
        System.out.println("\nAll Students Information:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println(students[i]);
        }

        scanner.close();
    }
}
