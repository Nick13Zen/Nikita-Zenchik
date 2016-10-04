import java.util.Scanner;
/**
 * Main class which contained entry point.
 * It read input from command line as three numbers.
 * Finds out is it a triangular and with kind of it.
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
            System.out.println(Helper.START);
            System.out.println(Helper.ABOUT);
            Double arg1 = input.nextDouble();
            if(checkEmpty(arg1)){
               System.exit(0);
            } else {
               Double arg2 = input.nextDouble();
               Double arg3 = input.nextDouble();
               solve(arg1 , arg2 , arg3);
            }
        } catch (Exception exp) {
            System.out.println(Helper.ERROR_NOT_A_NUMBER);
        }
    }
    /**
     * The method check number for correctness and result text output.
     * 
     * @param number double value.
     */
    public static boolean checkEmpty(Double Arg1){
        if(Arg1.isNaN()) {
           System.out.println(Helper.EMPTY);
           return true;
        } else {
           return false;
        }
    }
    /**
     * The method finds of witch kind is triangular and does it exist.
     * 
     * @param arg1 double value.
     * @param arg2 double value.
     * @param arg3 double value.
     */
    public static void solve(double arg1,double arg2, double arg3){
        if(((arg1+arg2)>arg3) || ((arg1+arg3)>arg2) || ((arg3+arg2)>arg1)){
            if((arg1==arg2) && (arg2==arg3) && (arg1==arg3)){
                System.out.println(Helper.EQUILATERAL);
                System.exit(0);
            } else {
                if((arg1==arg2) || (arg2==arg3) || (arg1==arg3)){
                    System.out.println(Helper.ISOSCELES);
                    System.exit(0);
                } else {
                	System.out.println(Helper.SIMPLE);
                    System.exit(0);
                }
            }
        } else {
            System.out.println(Helper.NOT_A_TRIANGULAR);
            System.exit(0);
        }
    }
}
