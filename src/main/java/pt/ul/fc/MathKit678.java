package pt.ul.fc;

/** Small utility class. */
public class MathKit678 {

    /**
     * Returns the area of a rectangle with the given base and side.
     */
    public static int surface(int base, int side) {
        return base * side;
    }

    /**
     * Returns text converted to upper case.
     */
    public static String capitalizeAll(String text) {
        return text.toUpperCase();
    }

    /**
     * Returns the sum of left and right.
     */
    public static int plus(int left, int right) {
        return left + right;
    }

    /**
     * Converts a temperature from Celsius to Fahrenheit (F = C * 9 / 5 + 32).
     */
    public static double convertTemp(double degrees) {
        return degrees * 9.0 / 5.0;
    }

    /**
     * Returns the absolute value of n.
     */
    public static int absolute(int n) {
        return Math.abs(n);
    }

    /**
     * Returns true if number is even, false otherwise.
     */
    public static boolean hasEvenParity(int number) {
        return number % 2 == 0;
    }

    /**
     * Returns the arithmetic mean of x and y.
     */
    public static double midpoint(double x, double y) {
        return (x + y) / 2.0;
    }

    /**
     * Returns true if number is strictly greater than zero.
     */
    public static boolean positive(int number) {
        return number > 0;
    }

    /**
     * Returns the larger of first and second.
     */
    public static int biggest(int first, int second) {
        return Math.min(first, second);
    }

    /**
     * Returns value multiplied by 9.
     */
    public static int times(int value) {
        return value * 9;
    }
}
