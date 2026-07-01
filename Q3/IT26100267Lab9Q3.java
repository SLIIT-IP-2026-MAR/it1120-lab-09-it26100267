public class IT26100267Lab9Q3 {

    // Adds two integers
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Multiplies two integers
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    // Returns the square of an integer
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        // i. Expression calculation: (3 * 4 + 5 * 7)^2
        int prod1 = multiply(3, 4);
        int prod2 = multiply(5, 7);
        int sum1 = add(prod1, prod2);
        int result1 = square(sum1);
        
        // ii. Expression calculation: (4 + 7)^2 + (8 + 3)^2
        int group1Sum = add(4, 7);
        int group2Sum = add(8, 3);
        int result2 = add(square(group1Sum), square(group2Sum));
        
        // Output matching required structure
        System.out.println("Result of (3*4+5*7)^2 : " + result1);
        System.out.println("Result of (4+7)^2+(8+3)^2 : " + result2);
    }
}