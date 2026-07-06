import java.util.*;
//1890A

public class DoremyPaint {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); // Number of test cases
		while (t-- > 0) {
			long n = scanner.nextLong(); // Length of the array for the current test case
			long[] a = new long[(int) n]; // Array to store the elements
			for (int i = 0; i < n; i++) {
				a[i] = scanner.nextLong(); // Input the elements of the array
			}

			// Map to store the frequency of each element in the array
			Map<Long, Long> frequencyMap = new HashMap<>();
			for (long value : a) {
				frequencyMap.put(value, frequencyMap.getOrDefault(value, 0L) + 1);
			}

			// Check the number of distinct elements in the array
			if (frequencyMap.size() >= 3) { // If there are 3 or more distinct elements
				System.out.println("No"); // It's not possible to make the array good
			} else {
				// Get the frequency of the smallest and largest elements
				long freq1 = frequencyMap.values().iterator().next();
				long freq2 = (long) frequencyMap.values().toArray()[frequencyMap.size() - 1];

				// Check if the array can be made good
				if (freq1 == freq2) { // If both frequencies are equal
					System.out.println("Yes"); // The array can be made good
				} else if (n % 2 == 1 && Math.abs(freq1 - freq2) == 1) { // If the array length is odd and the frequency difference is 1
					System.out.println("Yes"); // The array can be made good
				} else {
					System.out.println("No"); // Otherwise, it's not possible
				}
			}
		}
		scanner.close();
	}

	// Time Complexity (TC): O(nlog2n) = O(100*log2(100)) = O(100*7) = O(700)
	// Space Complexity (SC): O(n+n) = O(2n) = O(n) = O(100)
}