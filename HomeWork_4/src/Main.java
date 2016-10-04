import java.util.Scanner;
/**
 * Main class which contained entry point.
 * It read input from command line as three numbers.
 * Solves the equation and prints results
 * The program read only three number coming first. The following numbers are
 * ignored.
 *
 * @author Nikita Zenchik
 */
public class Main {
    /**
     * Print message and receive three numbers from console.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println(Message.START);
            System.out.println(Message.ABOUT);
            Double arg1 = input.nextDouble();
            if(checkEmpty(arg1)){
               System.exit(0);
            } else {
               Double arg2 = input.nextDouble();
               Double arg3 = input.nextDouble();
               solveDiscriminant(arg1 , arg2 , arg3);
            }
        } catch (Exception exp) {
            System.out.println(Message.ERROR_NOT_A_NUMBER);
        }
    }
    /**
 * The method check number for correctness and result text output.
 * 
 * @param number double value.
 */
    public static String check(double number) {
        if(Double.isNaN(number)) {
           return Message.NAN_NUMBER;
        }
        if(!Double.isInfinite(number)) {
           return String.valueOf(number);
        } else {
           return Message.BOUNDS_ERROR;  
        }
    }
    /**
     * The method check number for correctness and result text output.
     * 
     * @param number double value.
     */
    public static boolean checkEmpty(Double Arg1){
        if(Arg1.isNaN()) {
           System.out.println(Message.EMPTY);
           return true;
        } else {
           return false;
        }
    }
    /**
     * The method check if number is zero.
     * 
     * @param zero double value.
     * @return True if zero==0.
     * @return False if zero!=0.
     */
    public static boolean checkZero(double zero){
        if(new Double(1.0/zero).isInfinite()) {	
           return true;
         } else {
           return false;
         }
    }
    /**
     * The method solves the equation and prints results.
     * 
     * @param arg1 double value.
     * @param arg2 double value.
     * @param arg3 double value.
     */
    public static void solveDiscriminant(double arg1, double arg2, double arg3){
        double D = Math.pow(arg2, 2)-4*arg1*arg3;
        if(!(Double.isInfinite(D))) {
            if(checkZero(D)){
                System.out.println(Message.ONE_ANSWER);
                System.out.println(check(-(arg2 / 2 * arg1)));
            } else { 
                   if(D<0){
                      System.out.println(Message.LESS_THEN_ZERO);
                      System.exit(0);
                } else {
                	System.out.println(Message.TWO_ANSWER);
                    System.out.println(check((-arg2+Math.sqrt(D))/(2 * arg1)));
                    System.out.println(check((-arg2-Math.sqrt(D))/(2 * arg1)));
                }
            }
         } else {
            System.out.println(Message.BOUNDS_ERROR);
            System.exit(0);
         }
    }
}
