package Tasks;

import java.util.Scanner;

public class Task_1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects (out of 100):");

        System.out.print("Subject 1: ");
        int subject1Marks = scanner.nextInt();

        System.out.print("Subject 2: ");
        int subject2Marks = scanner.nextInt();

        System.out.print("Subject 3: ");
        int subject3Marks = scanner.nextInt();

        System.out.print("Subject 4: ");
        int subject4Marks = scanner.nextInt();

        System.out.print("Subject 5: ");
        int subject5Marks = scanner.nextInt();

        scanner.close();

        // Calculating total marks and percentage
        int totalMarks = subject1Marks + subject2Marks + subject3Marks + subject4Marks + subject5Marks;
        double percentage = (double) totalMarks / 500 * 100;

        // Displaying the result
        System.out.println("\nTotal Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
    }
}
