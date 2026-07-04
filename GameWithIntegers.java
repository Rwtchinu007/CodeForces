
import java.util.Scanner;

public class GameWithIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input
        int t = scanner.nextInt(); // Read the number of test cases
        while (t-- > 0) { // Loop over each test case
            long n = scanner.nextLong(); // Read the integer n for the current test case
            // Check if n is divisible by 3
            if (n % 3 == 0) {
                System.out.println("Second"); // Output "Second" indicating Vova wins
            } else {
                System.out.println("First"); // Output "First" indicating Vanya wins
            }
        }
        scanner.close(); // Close the scanner
    }
}

// Time Complexity (TC): O(1)
// Space Complexity (SC): O(1)
