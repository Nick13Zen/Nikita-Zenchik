/**
 * Main class which contained entry point.
 * Program works only with one argument another arguments will be ignored.
 * It read input <code>String</code> from command line and print
 * "Hello, <code>String</code>".
 * If <code>String</code> is empty than print "Hello, User!".
 * 
 * @author Nikita Zenchik
 */

public class Main {
	/**
	 * The method that gets user name from console and prints Hello Name.
	 * @params args array with parameter as User Name.
	 */
	public static void main(String[] args) {
        if(args.length>0){
            System.out.println("Hello, " + args[0] + "!");
        }
        else{
            System.out.println("Hello, User!");
        }
    }
}
	

