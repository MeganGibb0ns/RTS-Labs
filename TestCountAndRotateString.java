/**
 * Tests the Count and RotateString classes
 * @author Megan Gibbons
 */
public class TestCountAndRotateString {
    /**
     * Tests the Count class
     * @return true if all tests are successful and false otherwise
     */
    public static boolean testCount() {
        int [] valsToCount = null;
        try {
            Count.countAboveAndBelow(0, valsToCount);
            return false;
        }
        catch (IllegalArgumentException e) {
        }
        valsToCount = new int[] {1, 5, 2, 1, 10};
        String expected = "above: 1, below: 4";
        if (!expected.equals(Count.countAboveAndBelow(6, valsToCount))) {
            return false;
        }
        // return true if tests pass
        return true;
    }
    /**
     * Tests the RotateString class
     * @return true if all tests are successful and false otherwise
     */
    public static boolean testRotateString() {
        String init = "MyString";
        String expected = "ngMyStri";
        // Test with an input less than the string length
        if (!expected.equals(RotateString.rotate(init, 2))) {
            return false;
        }
        // Test with an input larger than the string length
        expected = "gMyStrin";
        if(!expected.equals(RotateString.rotate(init, 9))) {
            return false;
        }
        // Ensure a negative number of characters to rotate throws an exception
        try {
            RotateString.rotate(init, -1);
            return false;
        }
        catch (IllegalArgumentException e) {
        }
        // Ensure an empty string throws an exception to avoid a floating point error
        init = "";
        try {
            RotateString.rotate(init, 1);
            return false;
        }
        catch (IllegalArgumentException e) {
        }
        // return true if tests pass
        return true;
    }
    /**
     * Run all test methods
     */
    public static void main(String[] args) {
        testCount();
        testRotateString();
    }
}
