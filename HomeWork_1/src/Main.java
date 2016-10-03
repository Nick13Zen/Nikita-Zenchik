/**
	 * Main class which contained entry point.
	 * Prints input parameters in format: "Argument № = parameter" in reverse
	 * order. Each parameter print in new line.
	 * 
	 * @author Nikita Zenchik
	 */
public class Main {
	/**
	 * The method that gets arguments from console line and prints the in reverse.
	 */
     public static void main(String[] args) {
          for(int i=args.length-1; i>=0; i--) {
             System.out.println("Arg " + i + " = " + args[i]);
          }
    }
}



