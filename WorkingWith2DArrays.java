
/**
 * This program demonstrates using a 2D array.
 * 
 * @author Marcy Held
 * Date: 02-08-16
 */
import java.util.Arrays;
import java.util.Random;

public class WorkingWith2DArrays {

    public static void main(String[] args) {
        
        int [][] baseArray = new int [7][5]; // 7 rows, 5 columns
        int [] rowTotals = new int [7];
        int [] columnTotals = new int [5];
        
        //load 2D array with random values 1 - 99, call method
        loadArray(baseArray);
        
        //display the 2D array, call method
        displayArray(baseArray);
        
        //sum all rows and store in an array, call method
        sumRows(baseArray, rowTotals);
        System.out.println("\nThe row totals are:\n" + 
                Arrays.toString(rowTotals));
        
        //sum all columns and store in an array, call method
        sumColumns(baseArray, columnTotals);
        System.out.println("\nThe column totals are:\n" +
                Arrays.toString(columnTotals));
        
        System.out.println("\nThe largest value stored in the 2D array is: " + 
                findLargestElement(baseArray));
    }
    // This method will sum all columns and store in an array
    private static void sumColumns(int[][] matrix, int[] totals) {
        //this method will only work for a 2D array that is not ragged
        //(it assumes that all rows have the same length, and just uses
        //length of the first row in the for loop)
        for (int column = 0; column < matrix[0].length; column++) {
            for (int row = 0; row < matrix.length; row++) {
                totals[column] += matrix[row][column];
            }
        }
    }
    
    //This method loads the 2D array
    private static void loadArray(int[][] matrix){
        
        Random rGen = new Random ();
        
        // matrix.length returns number of rows
        //matrix[row].length returns the length of row array, which is the
        //  number of columns
        for (int row = 0; row < matrix.length; row++) 
        {
            for (int column = 0; column < matrix[row].length; column++) 
            {
                matrix[row][column] = rGen.nextInt(99) + 1;                
            }
        }
    }
    
    //This method displays the 2D array
    private static void displayArray(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            System.out.println(Arrays.toString(matrix[row]));
        }
    }
    
    //This method will sum all rows and store in an array
    private static void sumRows(int[][] matrix, int [] totals) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++){
                //totals[row] = totals[row] + matrix[row][column]
                totals[row] += matrix [row][column];
            }
        }  
    }
    
    //This method will find the largest element in the array and display that value
    private static int findLargestElement(int[][] matrix){
        int largest = matrix[0][0];
        for (int row = 0; row < matrix.length; row++){
            for (int column = 0; column < matrix[row].length; column++){
                if (matrix[row][column] > largest){
                    largest = matrix[row][column];
                }
            }
            
        }
        return largest;
    }
    
}
