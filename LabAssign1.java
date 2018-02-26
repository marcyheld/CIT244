
/**
 * This is lab 1. This program simulates a variation of the game Craps.
 * 
 * @author Marcy Held
 * Date: 02-01-16
 */
import java.util.Random;

public class LabAssign1 {

    public static void main(String[] args) {
        int sumOfRoll, pointValue;
        
        // Get the sum of the 2 dice by calling rollDice() method and assingn
        // sum value to sumOfRoll variable
        sumOfRoll = rollDice();
        
        // Sum values that would result in an immediate loss
        if (sumOfRoll == 2 || sumOfRoll == 3 || sumOfRoll == 12) {
            System.out.println ("You lose");
        }
        
        // Sum value that would result in an immediate win
        else if (sumOfRoll == 7 || sumOfRoll == 11) {
            System.out.println ("You win");   
        }
        
        // All other sum values, game continues
        else {
            // Assign sumOfRoll to pointValue variable and print out the value
            pointValue = sumOfRoll;
            System.out.println("The point is " + pointValue);
            
            // Continue to roll the 2 dice until a sum of 7 or a sum that 
            // equals the point value is achieved
            do {  
                sumOfRoll = rollDice();
                } while (sumOfRoll != 7 && sumOfRoll != pointValue);
            
            // If 7 is rolled, player loses
            if (sumOfRoll == 7) {
                System.out.println("You lose");
            }
            
            // If point value is matched, player wins
            else {
                System.out.println("You win");
            }   
        }   
    }
    
    public static int rollDice() {
        int die1, die2, sum;
        
        // Create new object of Random Class, 2 variables to represent
        // each die (values 1 through 6 for each)
        Random roll = new Random ();
        die1 = roll.nextInt (6) + 1;
        die2 = roll.nextInt (6) + 1;
        
        // Sum the 2 dice values
        sum = die1 + die2;
        
        // Print out roll info
        System.out.println ("You rolled " + die1 + " + " + die2 +
                " = " + sum);
        
        // Return sum value to main method
        return sum;     
    }    
}
