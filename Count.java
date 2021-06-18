/**
 * Count prints and returns the number of values in an array above and below 
 * a certain threshold
 * @author Megan Gibbons
 */
public class Count {
    public static String countAboveAndBelow(int value, int[] valsToCount) {
        // Verify that the array passed into the function is initialized
        if (valsToCount == null) {
            throw new IllegalArgumentException();
        }
        int above = 0; // Number of values in the array above the threshold
        int below = 0; // Number of values in the array below the threshold
        for (int val : valsToCount) {
            // Increment above if a value is above the threshold
            if (val > value) {
                above += 1;
            }
            // Increment below if the array is below the threshold
            else if (val < value) {
                below += 1;
            }
        }
        // Store, print, and return the result
        String result = "above: " + above + ", below: " + below;
        System.out.println(result);
        return result;
    }
}
