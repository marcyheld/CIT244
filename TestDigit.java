
/**
 * Demos static class methods.
 * 
 * @author Marcy Held
 * Date: 02-10-16
 */
import javax.swing.JOptionPane;

public class TestDigit {

    public static void main(String[] args) {
        String input;
        long number = 0L;
        do {
        input = JOptionPane.showInputDialog(null, "Enter a whole number");
        } while (!DigitValidator.isWholeNumber(input));
        
        number = Long.parseLong(input);
        
        JOptionPane.showMessageDialog(null, "The number is : " + number);
        System.exit(0);
    }
    
}
