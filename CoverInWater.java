import java.util.Scanner;

public class CoverInWater {
    //1900A
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt(); // Read the number of test cases
		while (t-- > 0) {
			int n = scanner.nextInt(); // Read the number of cells in the current test case
			String s = scanner.next(); // Read the string representing the row of cells

			// Initialize a flag to check for three continuous empty cells
			boolean continuousThreeEmptyCells = false;
			// Initialize a counter for the total number of empty cells
			int totalCountOfEmptyCells = 0;

			// Iterate through the cells
			for (int i = 0; i < n; i++) { // Loop through each cell
				// Check if there are three continuous empty cells
				if (s.charAt(i) == '.' && i + 1 < n && s.charAt(i + 1) == '.' && i + 2 < n && s.charAt(i + 2) == '.') {
					continuousThreeEmptyCells = true; // Set the flag to true if found
					break; // No need to check further if we found three continuous empty cells
				}
				// Count the number of empty cells
				if (s.charAt(i) == '.') {
					totalCountOfEmptyCells++;
				}
			}

			// If there are three continuous empty cells, only 2 actions are needed
			if (continuousThreeEmptyCells) {
				System.out.println(2);
			} else {
				// Otherwise, the number of actions needed is equal to the number of empty cells
				System.out.println(totalCountOfEmptyCells);
			}
		}
		scanner.close();
	}
}

// Time Complexity (TC): O(n) = O(100)
// Space Complexity (SC): O(n) = O(100)