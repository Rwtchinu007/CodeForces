
import java.util.Scanner;

public class JaggedSwaps {
    //1896A

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Read the number of test cases
        while (t-- > 0) { // Loop through each test case
            long n = scanner.nextLong(); // Read the size of the permutation
            long[] a = new long[(int) n]; // Declare an array to store the permutation elements
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong(); // Read each element of the permutation
            }
            // Check if the first element of the permutation is 1
            if (a[0] == 1) {
                System.out.println("YES"); // If true, print "YES"
            } else {
                System.out.println("NO"); // Otherwise, print "NO"
            }
        }
        scanner.close(); // Close the scanner
    }
}

// Time Complexity (TC): O(n) = O(10)
// Space Complexity (SC): O(n) = O(10)
