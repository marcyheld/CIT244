
/**
 * This program calls another program.
 * 
 * @author Marcy Held
 * Date: 01-20-16
 */
public class TestCalculator {

    public static void main(String[] args) {
        String[] s1 = {"25", "-", "15"};
        String[] s2 = {"75", "/", "5"};
        // need double quotes because the arrays are literal Strings
        
        //Pass s1 and s2 to main method of Calculator class
        //Calculator class in same package, so don't need an import statement
        Calculator.main(s1);
        Calculator.main(s2);
    }
    
}
