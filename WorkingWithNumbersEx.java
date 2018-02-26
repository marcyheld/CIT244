
/**
 *
 * @author Marcy Held
 * Date: 01-27-16
 */
import javax.swing.JOptionPane;

public class WorkingWithNumbersEx {

    public static void main(String[] args) {
        long number = 0L;
        int count, digit;
        String input;
        boolean flag1 = true;
        
        while (flag1) {
        try {
            input = JOptionPane.showInputDialog(null, "Enter a whole number");
            number = Long.parseLong(input); // if exception will be thrown, it will be thrown here
            flag1 = false; // if we get to this line, exception was not thrown
        }
        catch (NumberFormatException nfe) {
            
        }
        }
        count = getSize (number);
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
    
}
