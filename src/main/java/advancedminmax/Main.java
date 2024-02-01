package src.main.java.advancedminmax;

/**
 * Test class for methods from src.main.java.advancedminmax.MinMax.java class.
 *
 * @author Cristian Sorescu (christian139601@gmail.com)
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Min out of 1,2: " + MinMax.min(1, 2));
        System.out.println("Min out of 1.2,-3.9: " + MinMax.min(1.2, -3.9));
        System.out.println("Max out of 1,2: " + MinMax.max(1, 2));
        System.out.println("Max out of 1.2,-3.9: " + MinMax.max(1.2, -3.9));
    }
}
