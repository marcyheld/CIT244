
/**
 * This is an example of 2 applications communicating.
 * 
 * @author Marcy Held
 * Date: 01-20-16
 */
public class Calculator {

    public static void main(String[] args) {
        // Check number of strings passed
        if (args.length != 3) 
        {
            System.err.println ("Bad data!");
            System.exit(1); 
            //passing System.exit something other than 0, symbolizes a termination
            // that isn't the normal termination
        }
        // The result of the operation
        int result = 0;
        
        // Determine the operator, 2nd element in the array
        // calling charAt method of string class
        // we want the first character out of the String
        switch (args[1].charAt(0)) 
        {
            case '+': result = Integer.parseInt(args[0]) +
                               Integer.parseInt(args[2]);
                break;
            case '-': result = Integer.parseInt(args[0]) -
                               Integer.parseInt(args[2]);
                break;
            case '.': result = Integer.parseInt(args[0]) *
                               Integer.parseInt(args[2]);
                break;
            case '/': result = Integer.parseInt(args[0]) /
                               Integer.parseInt(args[2]);    
        }
        
        // Display result
        System.out.println(args[0] + " " + args[1] + " " + args[2] +
                " = " + result);
    }
    
}
