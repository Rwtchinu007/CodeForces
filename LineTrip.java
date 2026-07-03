
import java.util.*;

public class LineTrip {
//1901A
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Read the number of test cases
        while (t-- > 0) {
            long n = sc.nextLong(); //no. of gas stations
            long x = sc.nextLong();

            //List to store points including start ,gas stations and end point
            List<Long> pointsList = new ArrayList<>();
            pointsList.add(0L); // Add starting point
            for (int i = 0; i < n; i++) {
                long point = sc.nextLong();
                pointsList.add(point); // Add gas station points
            }
            pointsList.add(x); // Add end point
            n = pointsList.size(); // Update n to include start and end points

            long maxDistanceBetweenPoints = 0; // Variable to track the maximum distance between consecutive points
            for (int i = 1; i < n; i++) {
                if (i == n - 1) {
                    // if its last point consider round trip distance
                    maxDistanceBetweenPoints = Math.max(maxDistanceBetweenPoints, 2 * (pointsList.get(i) - pointsList.get(i - 1)));
                } else {
                    maxDistanceBetweenPoints = Math.max(maxDistanceBetweenPoints, pointsList.get(i) - pointsList.get(i - 1));
                }

            }
            System.out.println(maxDistanceBetweenPoints); // Print the maximum distance
        }
        sc.close(); // Close the scanner to prevent resource leaks
    }
}
