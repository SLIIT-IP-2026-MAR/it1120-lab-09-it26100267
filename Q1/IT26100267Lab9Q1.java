import java.util.Scanner;

public class IT26100267Lab9Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter value a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter value b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter value c: ");
        double c = scanner.nextDouble();
        
        // Calculate determinant (b^2 - 4ac)
        double determinant = Math.pow(b, 2) - (4 * a * c);
        
        if (determinant >= 0) {
            System.out.println("Roots are real and different:");
            
            // Quadratic formula: (-b ± sqrt(b^2 - 4ac)) / (2a)
            double root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            double root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            
            System.out.printf("Root 1: %.2f\n", root1);
            System.out.printf("Root 2: %.2f\n", root2);
        } else {
            System.out.println("Roots are complex and imaginary.");
        }
        
        scanner.close();
    }
}