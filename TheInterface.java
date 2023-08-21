/** Interface for basic math operation. */
public interface TheInterface {

    /**
     * Multiplies two numbers and return product.
     * 
     * @param multiplicant first number to be multiplied.
     * @param multiplier factor of multiplicaiton.
     */
    int multiply(int multiplicant, int multiplier);

    /**
     * Sums two numbers.
     * 
     * @param base the first number
     * @param addition the second number
    */
    int add(int base, int addition);

    /**
     * Sums two numbers.
     * 
     * @param first the first number
     * @param second the second number
    */
    int sum(int first, int second);

    /**
     * Calculate square f the given root.
     * 
     * @param root os the square
     * @return square of the given root.
    */
    int square(int root);
}