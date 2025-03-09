import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter marks
        System.out.print("Enter student's marks: ");
        int marks = scanner.nextInt();

        // Variable to store the grade
        String grade;

        // Using a mock value just to enter the switch
        int selector = 1;

        switch (selector) {
            case 1:
                if (marks >= 90 && marks <= 100) {
                    grade = "A";
                    break;
                }
            case 2:
                if (marks >= 80 && marks <= 89) {
                    grade = "B";
                    break;
                }
            case 3:
                if (marks >= 70 && marks <= 79) {
                    grade = "C";
                    break;
                }
            case 4:
                if (marks >= 60 && marks <= 69) {
                    grade = "D";
                    break;
                }
            case 5:
                if (marks >= 0 && marks < 60) {
                    grade = "F";
                    break;
                }
            default:
                grade = "Invalid marks";
                break;
        }

        System.out.println("Grade: " + grade);

        scanner.close();
    }
}

