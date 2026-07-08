import java.util.Scanner;

public class DaytonaCost{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); // Read the number of test cases
		while (t-- > 0) {
			long n = scanner.nextLong(); // Read the size of the array
			long k = scanner.nextLong(); // Read the integer k
			long[] a = new long[(int) n]; // Initialize the array
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextLong(); // Input array elements
			}

			boolean numberIsPresent = false; // Flag to check if k is present in the array
			for (int i = 0; i < n; i++) {
				if (a[i] == k) { // Check if the current element is equal to k
					numberIsPresent = true; // Set flag to true if k is found
					break; // Exit the loop as we found k
				}
			}

			if (numberIsPresent) {
				System.out.println("YES"); // Output YES
			} else {
				System.out.println("NO"); // Output NO
			}
		}
		scanner.close();
	}
}

/*
Time Complexity (TC): O(n) = O(100)
Space Complexity (SC): O(n)
*/