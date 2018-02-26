
/**
 * This is lab assignment 2. This program accepts a credit card number as
 * a long data type and uses the Mod 10 check to determine whether the credit 
 * card number is valid.
 * 
 * @author Marcy Held
 * Date: 02-09-16
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class LabAssign2 {

    public static void main(String[] args) {
        long number = 0L;
        int digits, firstNumber, firstSum, secondSum, finalSum;
        boolean flag1 = true;
        
        Scanner input = new Scanner (System.in);
        
        // Prompt user for input of a credit card number to test.
        // Repeat prompt if any non-numeric characters are entered.
        while (flag1) {
            try {
                System.out.print("Enter a credit card number as a long integer: --> ");
                number = input.nextLong();
                flag1 = false;
            }
            catch(InputMismatchException ime) {
                input.nextLine();
            }
        }
        
        // Pass number (long data type) to getSize method to count the number
        // of digits and return the resulting integer to the variable "digits"
        digits = getSize(number);
        
        // Begin testing validity of the credit card number.
        // If the number of digits is less than 13 or greater than 16,
        // the credit card number is invalid.
        if (digits < 13 || digits > 16)
            System.out.println(number + " is invalid");
        
        // If number of digits is 13 - 16 inclusive, continue testing
        else {
            
            // Create array of integers to hold the digits of the credit card
            // number. Pass number and digits to getCardNumberArray method.
            int [] creditCardNumber = getCardNumberArray(number, digits);            
            
            // Assign first index position in creditCardNumber array to 
            // firstNumber int variable. Continue testing the validity of
            // the credit card number.
            firstNumber = creditCardNumber[0];

            // Only credit cards that begin with 4, 5, 6, or 37 are valid.
            if (firstNumber == 1 || firstNumber == 2 || firstNumber == 7 ||
                    firstNumber == 8 || firstNumber == 9) {
                System.out.println(number + " is invalid");
            }
            
            else if (firstNumber == 3 && creditCardNumber[1] != 7)
                System.out.println(number + " is invalid");
            
            // Begin Mod 10 test
            else { 
                /* 
                   firstSum is the result of doubling every other number R to L.
                   If the doubling results in a double-digit number, add the
                   digits. These operations are performed by getFirstSum method.
                   Add the results of these operations together and return as 
                   an int to firstSum.
                */
                firstSum = getFirstSum(creditCardNumber);

                // secondSum is the sum of all of the other numbers in the 
                // credit card number.
                secondSum = getSecondSum(creditCardNumber);

                // add firstSum and secondSum together to create finalSum.
                finalSum = firstSum + secondSum;

                // Final step in Mod 10 test:
                // If finalSum is divisible by 10, then the credit card number 
                // is valid.
                // Print out the results.
                if ((finalSum % 10) == 0)
                    System.out.println(number + " is valid");

                else
                    System.out.println(number + " is invalid");
            }
        }         
    }
    
    private static int getSize (long num) {
        int numberOfDigits = 0;
        
        // while number doesn't equal zero, divide by 10 (take off
        // the last digit in the number) and increment numberOfDigits each 
        // time the loop is executed.
        while (num != 0) 
        {
            numberOfDigits++;
            num = num / 10;
        } 
        return numberOfDigits;   
    }
    
    private static int[] getCardNumberArray (long num, int dig) {
        
        // Create a new int array to hold all of the digits of the credit card.
        // The length of the array is the number of digits in the credit card.
        // Beginning at the end of the array, fill it with the digits of
        // the credit card number.
        int [] cardArray = new int [dig];

            for (int i = (dig - 1); i >= 0; i--) 
            { 
                cardArray [i] = (int)(num % 10);
                num /= 10;
            }
            return cardArray;
    }
    
    private static int getFirstSum(int[] cardArray) {
        int temp, sum = 0;
        
        // begin for loop at second-to-last element in the array and include
        // every other number
        for (int i = (cardArray.length - 2); i >= 0; i -= 2) 
            {
                temp = cardArray [i];
                                
                if (temp >= 5) {
                    temp = cardArray[i] * 2;
                    sum += (temp / 10) + (temp % 10);
                    }  
                else
                    sum += cardArray [i] * 2;
            }
        return sum;
    }
    
    private static int getSecondSum (int[] cardArray) {
        int sum = 0;
        
        // begin at last element in the array and include every other number
        // (this includes all numbers NOT included in getFirstSum operations)
        for (int i = (cardArray.length - 1); i >= 0; i -= 2) 
            {
                sum += cardArray[i];
            }
        return sum;   
    }  
}
