
import java.util.*;


/**
 * This class uses methods of the Calendar,
 * GregorianCalendar class.
 * 
 * @author Marcy Held
 * Date: 02-10-16
 */
public class WorkingWithClasses {

    public static void main(String[] args) {
        
        GregorianCalendar a = new GregorianCalendar();
        // .getTimeZone returns a class obj of type TimeZone
        // .getTimeZone interfaces with computer settings
        System.out.println(a.getTimeZone().getDisplayName());
        System.out.println(a.get(Calendar.YEAR));
        System.out.println(a.get(Calendar.MONTH)); //anum data type,
        // ^ index position 1 represents 2nd month, we ran this program in Feb
        // and Calendar.MONTH returned 1
        System.out.println(a.get(Calendar.HOUR_OF_DAY));
    }
    
}
