
/**
 * ArrayList class demo
 * 
 * @author Marcy Held
 * Date: 03-02-2016
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
// import java.util.*;

public class WorkingWithLists {

    public static void main(String[] args) {
        
        String [] s = {"red", "green", "blue"};
        
        // creat an ArrayList object from an array
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s));
        // .asList static method of Arrays Class allows us to take an
        // array, take all of its data, and make it an ArrayList object
        
        // Also, we can convert an ArrayList to an array...
        String [] s2 = new String[list.size()];
        list.toArray(s2); // loads s2 with whatever list holds
        
        System.out.println(list.toString());
        System.out.println(Arrays.toString(s2));
        
        Integer[] intArray = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(intArray));
        
        System.out.println(list2);
        
        // use Collections Class to work with ArrayLists
        Collections.sort(list2);
        System.out.println(list2);
        
        Collections.shuffle(list2);
        System.out.println(list2);
        
        System.out.println("The largest value is " + Collections.max(list2));
        System.out.println("The smallest value is " + Collections.min(list2));

    }
    
}
