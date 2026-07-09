import java.util.Scanner;

public class TargetPractice {
	// Predefined score matrix representing the target's rings
	// Each element represents the score for that position on the target
	private static final int[][] score = {
		{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
		{1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
		{1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
		{1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
		{1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
		{1, 2, 3, 4, 5, 5, 4, 3, 2, 1},
		{1, 2, 3, 4, 4, 4, 4, 3, 2, 1},
		{1, 2, 3, 3, 3, 3, 3, 3, 2, 1},
		{1, 2, 2, 2, 2, 2, 2, 2, 2, 1},
		{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
	};

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); // Number of test cases
		while (t-- > 0) {
			char[][] a = new char[10][10]; // 10x10 grid to store the target for each test case
			for (int i = 0; i < 10; i++) { // Loop through each row of the grid
				String s = scanner.next();
				for (int j = 0; j < 10; j++) { // Loop through each column of the grid
					a[i][j] = s.charAt(j); // Store each character in the grid
				}
			}
			// Input for the current test case is now stored in 'a'

			int totalScore = 0; // Variable to accumulate the total score for the current test case
			for (int i = 0; i < 10; i++) { // Loop through each row of the grid
				for (int j = 0; j < 10; j++) { // Loop through each column of the grid
					if (a[i][j] == 'X') { // Check if there is an arrow at this position
						totalScore += score[i][j]; // Add the score for this position to the total score
					}
				}
			}
			System.out.println(totalScore); // Output the total score for the current test case
		}
		scanner.close();
	}

	// Time Complexity (TC): O(n^2) = O(100)
	// Space Complexity (SC): O(10*10) = O(100)
}