/**
 * This program demonstrates various text concepts.
 * 
 * @author Marcy Held
 * Date: 02-22-16
 */
import java.util.Scanner;

public class WorkingWithStrings {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        String s1 = "I save space";
        String s2 = new String ("I save space");
        String s3 = "I save space";
        
        // == vs .equals
        // == refers to memory address location, .equals refers to 
        // content of string
        // when using == with class level variables, always refers to 
        // memory address location!!
        if (s1 == s2)
            System.out.println("String objects are equal");
        else
            System.out.println("String objects are NOT equal");
        
        if (s1 == s3)
            System.out.println("String objects are equal");
        else
            System.out.println("String objects are NOT equal");
        
        // .equals method
        if (s1.equals(s2))
            System.out.println("Content of String objects is equal");
        else
            System.out.println ("Content of String objects is NOT equal");
        
        //.compareTo method
        if (s1.compareTo(s2) == 0) //objects are equal if compareTo returns 0
            System.out.println("Content of String objects is equal");
        else
            System.out.println("Content of String objects is NOT equal");
        
        //.toUpperCase
        // makes content of string all upper case letters, assigns new string
        // to new memory address
        s1 = s1.toUpperCase();
        
        // before this s1 and s3 shared same mem address location,
        // after s1 is uppercase, they will share different mem address location
        if (s1 == s3)
            System.out.println("String objects are equal");
        else
            System.out.println("String objects are NOT equal");
        
        
        // regular expressions
        // ###-##-####
        do {
        System.out.print("Enter your SSN in the format of \n" + 
                "###-##-#### including white spaces --> ");
        s1 = scan.nextLine();
        } while(!s1.matches("\\d{3}-\\d{2}-\\d{4}")); 
        // \\d means what follows will be digits 0 thru 9
        // 2 backslashes indicate the data type that we are looking for
        // while (!s1.matches("\\d{3} \\d{2} \\d{4})); accepts white spaces
        // between numbers
        
        // phone number
        // ###-###-####
        do {
        System.out.print("Enter your phone number\n" +
                "including area code and dashes --> ");
        s1 = scan.nextLine();
        } while (!s1.matches("[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}"));
        // any number between 1 to 9 represents first digit, and
        // the following 2 digits can be anything
        
        
        // first and last name and require that each begins with uppercase letter
        do {
            System.out.print("Enter your first name --> ");
            s1 = scan.nextLine();
        } while (!s1.matches("[A-Z][a-zA-Z]*"));
        
        // upper or lowercase first letter, can have space, can have an apostrophe
        // or a dash
        do {
            System.out.print("Enter your last name --> ");
            s1 = scan.nextLine();
        } while (!s1.matches ("[a-zA-z]+([ '-][a-zA-Z]+)*"));
        // dash, white space, or apostrophe can occur anywhere in name after
        // first character, DOES NOT need to be the 2nd character  
        
        s1 = "C:/Users/Owner/Desktop/book/Chapter11";
        String[] s = s1.split("/"); //splits string when it finds a colon or a slash
        // "colon or slash serves as a delimeter"
        // C: at [0], Users at [1], Owner at [2], Desktop at [3], book at [4], and
        // Chapter11 at [5]
        System.out.println("The drive and folders are: ");
        //enhanced for loop
        // data type and name it and 
        //(what each element in the array is going to be : array itself)
        for(String sc: s)
            System.out.println(sc);
        
        StringBuilder sb = new StringBuilder("Let's Go ");
        sb.append("Bucs!");
        System.out.println(sb);
        sb.replace (9, 13, "Steelers"); // keeps exclamation point at end (index 14)
        System.out.println(sb);
    }
    
}
