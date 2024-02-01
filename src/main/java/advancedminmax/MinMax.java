package advancedminmax;

/**
 * MinMax.java
 *
 * <p>
 * Improved Math.min and Math.max from standard java library.
 * This class implements advanced min/max methods that allow an arbitrary
 * number of arguments.
 * <p>
 * Usage example:
 * MinMax.min(1,2,-5,...,n);
 * MinMax.min(1.2,2.3,-5.0,...,n.n);
 * MinMax.max(1,2,-5,...,n);
 * MinMax.max(1.2,2.3,-5.0,...,n.n);
 *
 * @author Cristian Sorescu (christian139601@gmail.com)
 * @version 1.0
 */

public class MinMax {

    /**
     * Returns the minimum of given values.
     *
     * @param numbers The given numbers.
     * @return The minimum of given values.
     */
    @SafeVarargs
    public static <T extends Number & Comparable<T>> T min(T... numbers) {
        validateInput(numbers.length);

        T min = numbers[0];

        for (T n : numbers) {
            if (n.compareTo(min) < 0) {
                min = n;
            }
        }

        return min;
    }

    /**
     * Returns the maximum of given values.
     *
     * @param numbers The given numbers.
     * @return The maximum of given values.
     */
    @SafeVarargs
    public static <T extends Number & Comparable<T>> T max(T... numbers) {
        validateInput(numbers.length);

        T max = numbers[0];

        for (T n : numbers) {
            if (n.compareTo(max) > 0) {
                max = n;
            }
        }

        return max;
    }

    private static void validateInput(int inputLength) {
        if (inputLength == 0) {
            throw new UnsupportedOperationException("At least 1 input expected");
        }
    }
}
