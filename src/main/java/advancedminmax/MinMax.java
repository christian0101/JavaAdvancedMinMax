package src.main.java.advancedminmax;

/**
 * src.main.java.advancedminmax.MinMax.java
 * <p>
 * Improved Math.min and Math.max from standard java library.
 * This class implements advanced min/max methods that allow an arbitrary
 * number of arguments.
 * <p>
 * Usage example:
 * src.main.java.advancedminmax.MinMax.min(1,2,-5,...,n);
 * src.main.java.advancedminmax.MinMax.min(1.2,2.3,-5.0,...,n.n);
 * src.main.java.advancedminmax.MinMax.max(1,2,-5,...,n);
 * src.main.java.advancedminmax.MinMax.max(1.2,2.3,-5.0,...,n.n);
 *
 * @author Cristian Sorescu (christian139601@gmail.com)
 * @version 1.0
 */

public class MinMax {

    /**
     * Returns the smaller of given values.
     *
     * @param numbers The given numbers.
     * @return The smaller of given values.
     */
    public static Integer min(Integer... numbers) {

        Integer min = numbers[0];

        for (Integer n : numbers) {
            if (n < min) {
                min = n;
            }
        }

        return min;
    }

    /**
     * Returns the smaller of given values.
     *
     * @param numbers The given numbers.
     * @return The smaller of given values.
     */
    public static Double min(Double... numbers) {

        Double min = numbers[0];

        for (Double n : numbers) {
            if (n < min) {
                min = n;
            }
        }

        return min;
    }

    /**
     * Returns the greater of given values.
     *
     * @param numbers The given numbers.
     * @return The greater of given values.
     */
    public static Integer max(Integer... numbers) {

        Integer max = numbers[0];

        for (Integer n : numbers) {
            if (n > max) {
                max = n;
            }
        }

        return max;
    }

    /**
     * Returns the greater of given values.
     *
     * @param numbers The given numbers.
     * @return The greater of given values.
     */
    public static Double max(Double... numbers) {

        Double max = numbers[0];

        for (Double n : numbers) {
            if (n > max) {
                max = n;
            }
        }

        return max;
    }
}
