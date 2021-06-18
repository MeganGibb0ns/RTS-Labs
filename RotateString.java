/**
 * RotateSting rotates the characters in a string by a given input and includes 
 * the overflow appear at the beginning of the string
 * @author Megan Gibbons
 */
public class RotateString {
    public static String rotate(String strToRotate, int numOfChars) {
        // Ensure the string has characters to rotate and that the number of 
        // characters to rotate is a positive value
        if (strToRotate.equals("") || numOfChars < 0) {
            throw new IllegalArgumentException();
        }
        // Find the length of the string
        int strLength = strToRotate.length();
        // If the number of characters to rotate exceeds the length of the string,
        // wrap back around
        if (numOfChars > strLength) {
            numOfChars = numOfChars % strLength;
        }
        // Return the string with the overflow at the front by dividing into substrings
        String result = strToRotate.substring(strLength - numOfChars, strLength)
            + strToRotate.substring(0, strLength - numOfChars);
        return result;
    }
}
