/**
 * The class contain some methods for sum, subtraction, multiplication and division.
 * 
 * @author Nikuta Zenchik
 */
public class Calculate {
	
    /**
     * The method sum first number to second number and return sum.
     * 
     * @param arg1 first number from command line.
     * @param arg2 second number from command line.
     * @return sum between first and second number.
     */
    public static double sum(double arg1, double arg2) {
        return (arg1 + arg2);
    }

    /**
     * The method subtract second number from first number and return
     * difference.
     * @param arg1 first number from command line.
     * @param arg2 second number from command line.
     * @return difference between first and second number.
     */
    public static double subtraction(double arg1, double arg2 ) {
        return (arg1 - arg2);
    }

    /**
     * The method multiplies first number by second number and return result
     * of this operation.
     * 
     * @param arg1 first number from command line.
     * @param arg2 second number from command line.
     * @return product like result of between multiplication between two
     * numbers.
     */
    public static double multiplication(double arg1,double arg2 ) {
        return (arg1 * arg2);
    }

    /**
     * The method divide first number by second number and return result
     * of this operation.
     * 
     * @param arg1 first number from command line.
     * @param arg2 second number from command line.
     * @return quotient like result of division between two numbers.
     */
    public static double division(double arg1, double arg2 ) {
        return (arg1 / arg2);
    }
}
