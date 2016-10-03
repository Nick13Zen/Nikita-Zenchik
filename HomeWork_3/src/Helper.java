/**
 * The class contain some <code>String</code> constants for user info, help
 * and some errors. It contain command line commands for program.
 *
 * @author Nikuta Zenchik
 */
public class Helper {

    public static final String ABOUT = "The program perform " +
            "arithmetic  operation like sum, subtraction, multiplication and " +
            "division between two input number and print it. \n " +
            "Only two numbers are allowed. Separator between integral and " +
            "fractional parts is \",\". The program read only two number " +
            "coming first. The following numbers are ignored.";

    public static final String ERROR_NOT_A_NUMBER = "Error. Input is " +
            "incorrect. Only numbers are allowed. Separator between integral " +
            "and fractional parts is \",\".";
    public static final String EMPTY = "Error. Line you entered is empty \"-help\".";

    public static final String BOUNDS_ERROR = "Error. Exceed the bounds of " +
            "acceptable values";

    public static final String BOUNDS_ERROR_INPUT = "Error. Exceed the bounds" +
            " of acceptable values. One of value or both is incorrect.";

    public static final String NAN_NUMBER = "Sorry, we can't calculate that " +
            "value.";

    public static final String DIVISION_BY_ZERO = "Error. Division by zero.";
}
