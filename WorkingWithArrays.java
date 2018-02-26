import java.util.Arrays;
/**
 * This program demonstrates the methods of the arrays class.
 * 
 * @author Marcy Held
 * Date: 02-01-16
 */


public class WorkingWithArrays {

    public static void main(String[] args) {
        int [] randomArray = new int [10];
        
        for (int i = 0; i < randomArray.length; i++) 
        {
            //Math.random returns double, need to cast
            // add 1 because Math.random will never return 1, range would be
            // 0 to 24, adding 1 ensures range will be 1 to 25
            randomArray[i] = (int)(Math.random() * 25) + 1;
            
            for (int k = 0; k < i; k++) 
            {
                if (randomArray[i] == randomArray[k]) 
                {
                    //break out of inner for loop and regenerate new number
                    //at same i position where the repeat occurred
                    //do not need to check rest of array if match is found
                    --i;
                    break; // if equal match is found, drop out of inner loop
                }   
            }
        }
        System.out.println(Arrays.toString(randomArray));
        Arrays.sort(randomArray);
        System.out.println(Arrays.toString(randomArray));
        
        //binarySearch method returns index position of where key was found
        //if key was not found, binarySearch method returns a negative value
        //that represents the index position if you wanted to insert that
        //value into the array
        if (Arrays.binarySearch(randomArray, 17) < 0)
            System.out.println("Value NOT found in array.");
        else
            System.out.println("Value found in array!");
    }  
}
