import java.util.Scanner;

public class IT26100267Lab9Q4 {

    // Calculates final mark taking 30% from assignments and 70% from exam
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

    // Determines the grade based on final marks boundary thresholds
    public static String findGrades(double mark) {
        if (mark >= 75) {
            return "A";
        } else if (mark >= 60) {
            return "B";
        } else if (mark >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    // Prints a single row matching tabular data expectations
    public static void printDetails(String name, double finalMark, String grade) {
        System.out.printf("%-10s%-15.2f%-10s\n", name, finalMark, grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Storage structures for processing 5 separate student dataset items
        String[] names = new String[5];
        double[] finalMarks = new double[5];
        String[] grades = new String[5];
        
        // Input phase
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = scanner.next();
            
            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignmentMark = scanner.nextDouble();
            
            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double examMark = scanner.nextDouble();
            
            // Calculate and store results using helper methods
            finalMarks[i] = calcFinalMark(assignmentMark, examMark);
            grades[i] = findGrades(finalMarks[i]);
            System.out.println(); // Prints empty line spacing consistent with sample
        }
        
        // Tabular display output execution phase
        System.out.printf("%-10s%-15s%-10s\n", "Name", "Final Mark", "Grade");
        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }
        
        scanner.close();
    }
}