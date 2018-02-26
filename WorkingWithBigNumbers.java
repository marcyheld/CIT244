/**
 * This program demonstrates the use of classes which
 * handle very large numbers.
 * 
 * @author Marcy Held
 * Date: 02-17-16
 */
import java.math.*;

public class WorkingWithBigNumbers {

    public static void main(String[] args) {
        
        String biggestInteger = String.valueOf(Long.MAX_VALUE);
        System.out.println(biggestInteger);
        
        BigInteger bigInt = new BigInteger(biggestInteger);
        //bigInt = bigInt.multiply(BigInteger.TEN); //multiply biggestInteger by 10
        bigInt = bigInt.multiply(new BigInteger("100")); // multiply biggestInteger by 100
        System.out.println(bigInt);
        
        BigDecimal bigD1 = new BigDecimal(3); // BigDecimal (unlike BigInteger)
                                        // accepts numeric value as input
        BigDecimal bigD2 = new BigDecimal(0.000000000000000000003);
        bigD2 = bigD1.multiply(bigD2);
        System.out.println (bigD2);
    }
    
}
