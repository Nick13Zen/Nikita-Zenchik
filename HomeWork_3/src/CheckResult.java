/**
 * The class contains methods for checking data.
 */
public class CheckResult {
    /**
     * The method check number for correctness and result text output.
     * 
     * @param number double value.
     */
    public static String check(double number) {
        if(Double.isNaN(number)) {
            return Helper.NAN_NUMBER;
        }
        if(!Double.isInfinite(number)) {
            return String.valueOf(number);
        } else {
            return Helper.BOUNDS_ERROR;  
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
         if(zero == 0) {	
           System.out.println(Helper.DIVISION_BY_ZERO);
           return true;
         }
         else{
              return false;
         }
    }
    /**
     * The method check if line is (-help).
     * 
     * @param line string line.
     * @return True if line=="-help".
     * @return False if zero!="-help".
     */
    public static boolean checkHelp(String line){
        if(line.equals("-help")) {
            System.out.println(Helper.ABOUT);
            return true;
            }
        else{
            return false;
            }
    }
    /**
     * The method check if line is empty.
     * 
     * @return True if line is empty.
     * @return False if line is not empty.
     */
    public static boolean checkEmpty(String[] line){
        if(line.length==0) {
            System.out.println(Helper.EMPTY);
        return true;
      } else{
            return false;
        }
    }
}
