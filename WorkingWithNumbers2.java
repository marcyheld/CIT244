
/**
 *
 * @author Marcy Held
 * Date: 01-27-26
 */
import javax.swing.JOptionPane;

public class WorkingWithNumbers2 {

    public static void main(String[] args) {
        long number;
        int count, digit;
        String input;
        
        do {
        input = JOptionPane.showInputDialog(null, "Enter a whole number");
        } while (!isWholeNumber(input));
        
        number = Long.parseLong(input);
        count = getSize(number);
        System.out.println ("The number of digits in the input value is " +
                count);
        displayNumberRightToLeft(number, count);
        System.exit(0);
    }
    /** Return the number of digits in d */
    private static int getSize (long d) {
        int numberOfDigits = 0;
        
        while (d != 0) {
            numberOfDigits++;
            d = d / 10; // move to the left one digit at a time
                        // 450 becomes 45 becomes 4(.5) becomes 0
        }
        
        return numberOfDigits;
    }
    
    private static void displayNumberRightToLeft (long number, int count) {
        System.out.println("The input value is " + number);
        System.out.print("The reversed digits are ");
        // count already holds number of digits
        // number%10 prints remainder after number is divided by 10
        // (this operation will always print out the last digit in number)
        for (int i = 0; i < count; i++) {
            if (i == count - 1) // test for last position
                System.out.print(number%10); // if in last position, no comma
            else
                System.out.print(number%10 + ",");
            number /= 10; // move to the left 1 digit at a time
        }
        System.out.println();
    }
    
    private static boolean isWholeNumber (String s) {
        
        for (int i = 0; i < s.length(); i++) 
        {
            if (!Character.isDigit(s.charAt(i)))
                return false;
        }
        return true; // have gone through entire string and have not found
                    // non-numeric character
    }
    
}
