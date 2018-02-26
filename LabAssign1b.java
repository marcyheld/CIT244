
/**
 * This is lab 1b. This program simulates a variation of the game Craps with
 * an added method and the ability to play as many games as the user wants.
 * 
 * Note: 2/3/16 --> do not need "losses" variable, can just divide number of
 * wins by numOfGames.
 * 
 * @author Marcy Held
 * Date: 01-27-16
 */
import java.util.Random;
import java.util.Scanner;
import java.text.NumberFormat;

public class LabAssign1b {

    public static void main(String[] args) {
        int numOfGames, wins = 0, losses = 0;
        double winPercentage;
        
        NumberFormat nf = NumberFormat.getPercentInstance();
        
        Scanner input = new Scanner (System.in);
        
        // Prompt user to enter the number of games and save their response to 
        // the numOfGames variable
        System.out.print("How many games do you want to play? --> ");
        numOfGames = input.nextInt();
        
        /* 
           Enter for loop. Get the sum of the 2 dice by calling rollDice() 
           method and pass the sum returned from the rollDice() method to the 
           determineOutcome method. Increment wins when determineOutcome method
           returns true, and increment losses when determineOutcome method
           returns false. Continue going through games of Craps until 
           user-entered number of games is completed.
        */
        
        for (int i = 1; i <= numOfGames; i++) {
                    
            if (determineOutcome(rollDice())) {
                System.out.println("You win");
                wins++;
            }
            else {
                System.out.println("You lose");
                losses++;
            }
        }
        
        //Print win percentage results
        winPercentage = ((double) wins / (wins + losses));
        System.out.println("You won " + wins + " games.");
        System.out.println("Your winning percentage is " + 
                nf.format(winPercentage));    
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
    
    public static boolean determineOutcome(int dice) {
        int pointValue;
        
        // Sum values that would result in an immediate loss
        if (dice == 2 || dice == 3 || dice == 12) {
            return false;
        }
        
        // Sum value that would result in an immediate win
        else if (dice == 7 || dice == 11) {
            return true;  
        }
        
        // All other sum values, point value is generated & game continues
        else {
            // Assign original sum value to pointValue variable
            pointValue = dice;
            System.out.println("The point is " + pointValue);
            
            // Continue to roll the 2 dice until a sum of 7 or a sum that 
            // equals the original point value is achieved
            do {
                dice = rollDice();
                } while (dice != 7 && dice != pointValue);
            
            // If 7 is rolled, player loses
            if (dice == 7) {
                return false;
            }
            
            // If point value is matched, player wins
            else {
                return true;    
            }   
            }     
    }
}
