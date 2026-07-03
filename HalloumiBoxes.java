import java.util.Arrays;
import java.util.Scanner;
public class HalloumiBoxes {
    //1903A
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  //read number of test cases
        while(t-- >0){
            long n = sc.nextLong(); // Read the number of boxes
			long k = sc.nextLong(); // Read the maximum length of subarray that can be reversed
			long[] a = new long[(int) n]; // Array to store the numbers on the boxes
            for (int i = 0; i < n; i++) {
				a[i] = sc.nextLong(); // Read each number into the array
			}
            long[] copy_a = Arrays.copyOf(a, a.length); // Create a copy of the original array
            Arrays.sort(copy_a); // Sort the copy of the array
           if (Arrays.equals(copy_a, a) || k > 1) {
				System.out.println("YES"); // If true, print "YES"
			} else {
				System.out.println("NO"); // Otherwise, print "NO"
			}
        }
    }
}