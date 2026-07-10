import java.util.Scanner;
//1877A

public class GoalsOfVictory {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); // Read the number of test cases
		while (t-- > 0) { // Loop through each test case
			long n = scanner.nextLong(); // Read the number of teams
			long[] a = new long[(int) n - 1]; // Array to store the efficiency of n-1 teams
			for (int i = 0; i < n - 1; i++) { // Loop to read the efficiency of n-1 teams
				a[i] = scanner.nextLong(); // Read efficiency of each team
			}

			long sum = 0; // Variable to store the sum of efficiencies of n-1 teams
			for (int i = 0; i < n - 1; i++) { // Loop to calculate the sum of efficiencies
				sum += a[i]; // Add each team's efficiency to the sum
			}

			System.out.println(-1 * sum); // Output the efficiency of the missing team, which is the negative of the sum
		}
		scanner.close(); // Close the scanner
	}
}

// Time Complexity (TC): O(n) = O(100)
// Space Complexity (SC): O(n) = O(100)