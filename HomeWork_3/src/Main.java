/**
 * Main class which contained entry point.
 * It read input from command line as two numbers and print some basic
 * operations between it like sum, subtraction, multiplication and division.
 * The program read only two number coming first. The following numbers are
 * ignored.
 *
 * @author Nikita Zenchik
 */ 
public class Main { 
    /**
     * Print message and receive two numbers from console and print sum,
     * subtraction,
     * multiplication and division between it.
     * 
     * @param args array with command line launch parameters.
     */
    public static void main(String[] args) {
        //try to read
          try {
              if(CheckResult.checkEmpty(args)){
                 System.exit(0);
              } else {
                     String stringArg1 = args[0];
                     if(CheckResult.checkHelp(args[0])){
                        System.exit(0);
                     } else {
                            String stringArg2 = args[1];
                            double arg1 = parsData(stringArg1);
                            double arg2 = parsData(stringArg2);
                            if(Double.isInfinite(arg1) || Double.isInfinite(arg2)) {
                               System.out.println(Helper.BOUNDS_ERROR_INPUT);
                               System.exit(0);
                            } else {
                                   printResult(arg1, arg2);
                              }
                       }
                }
          } catch (Exception exp) {
              System.out.println(Helper.ERROR_NOT_A_NUMBER);
            }
    }

    /**
     * The method print operation as sum, subtraction, multiplication and
     * division between two numbers,result of it and check result for valid.
     * 
     * @param arg1 first number from command line.
     * @param arg2 second number from command line.
     */
    public static void printResult(double arg1, double arg2) {
        Double result;

        result = Calculate.sum(arg1, arg2);
        System.out.println("Sum" + " = " + CheckResult.check(result));

        result = Calculate.subtraction(arg1, arg2);
        System.out.println("Subtraction" + " = " + CheckResult.check(result));

        result = Calculate.multiplication(arg1, arg2);
        System.out.println("Multiplication" + " = " + CheckResult.check(result));

        if(CheckResult.checkZero(arg2)){
           System.exit(0);
        } else {
               result = Calculate.division(arg1, arg2);
               System.out.println("Division" + " = " + CheckResult.check(result));
          }
    }
    /**
     * The method pars string into double.
     * 
     * @param line string line.
     * @return data double value
     */
    public static double parsData(String line){
        double data = Double.valueOf(line);
        return data;
    	
    }
}