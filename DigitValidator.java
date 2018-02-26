
/**
 * This class is a pure service class with only static methods.
 * 
 * @author Marcy Held
 * Date: 02-10-16
 */

// keyword "final" denotes that class cannot be altered
final public class DigitValidator {
    public static int countDigits (long d)
    {
        int count = 0;
        while (d != 0) {
            count++;
            d /= 10; // divide by 10, reassign new value to d
        }
        return count;   
    }
    
    public static boolean isWholeNumber(String s) 
    {
        for (int i = 0; i < s.length(); i++) // don't need curly braces for 1 statement
            if (!Character.isDigit(s.charAt(i))) // not a statment
                return false; // statement associated with if and with for
            return true; // this statement is outside of for loop
    }
    
}
