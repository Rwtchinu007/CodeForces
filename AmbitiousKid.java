import java.util.Scanner;

public class AmbitiousKid {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long n = scanner.nextLong(); // Read the number of elements in the array
		long[] a = new long[(int) n]; // Initialize the array to store elements

		// Read the elements of the array
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextLong(); // Input each element
		}

		long minimumOperations = Long.MAX_VALUE; // Initialize minimum_operations with a large value

		// Loop through each element to find the minimum absolute value
		for (int i = 0; i < n; i++) {
			minimumOperations = Math.min(minimumOperations, Math.abs(a[i]));
		}

		// Output the minimum number of operations needed
		System.out.println(minimumOperations);
		scanner.close();
	}

	// Time Complexity (TC): O(n)
	// Space Complexity (SC): O(n)
}