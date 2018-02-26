
/**
 * This is lab 3.
 * @author Marcy Held
 * Date: 02-27-16
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class LabAssign3 {

    public static void main(String[] args) {
        
        Employee [] employeeArray;
        int numEmployees, eDeptCode;
        String eName;
        Employee e;
        Date eDate;

        /*
            if (scan.hasNextInt())
                inputCount = scan.nextInt();
            else
                scan.next();
        */
        // get valid number of employees to create
        numEmployees = getValidInput();
        // create the array of Employee objects
        employeeArray = new Employee [numEmployees];
        
        for (int i = 0; i < employeeArray.length; i++) 
        {
            // get valid employee name
            eName = getValidName(i+1);            
            // get valid employee hire date
            eDate = getValidHireDate();
            // get valid employee department code
            eDeptCode = getValidDeptCode();
            // create employee object using name, hire date, and dept code
            e = new Employee (eName, eDate, eDeptCode);
            // assign employee object to array
            employeeArray[i] = e;
        }
        
        // print out the employee objects in the array
        System.out.println("-----------------");
        for (int k = 0; k < employeeArray.length; k++) 
        {
            System.out.println(employeeArray[k].toString());
            System.out.println("-----------------");
        } 

    }
    
    /*
        getValidInput method returns the number of employee objects to be
        created as an int.
    
        A valid initial input:
            1) Is an integer,
            2) Is 1 or greater,
            3) Includes no alphabetic characters.
    */
    private static int getValidInput () {
        Scanner scan = new Scanner (System.in);
        int num = 0;
        boolean inputError = true;
        
        while (inputError) 
        { 
            try 
            {
                System.out.print("How many new employees to enter? --> ");
                num = scan.nextInt();
                inputError = false;
                
                if (num <= 0)
                inputError = true;
            }
            catch (InputMismatchException ime) 
            {
                scan.nextLine();
            }
        }
        
        scan.nextLine();
        
        return num;    
    }
    
    /* 
        getValidName method returns the employee name as a String. This
        method accepts the employee number (i+1) as input for
        printing/formatting purposes.
    
        A valid name:
            1) First name begins with a capital letter and is then followed
                by any combination of lower and/or uppercase letters,
            2) A single whitespace character between first and last names,
            3) Last name can begin with a lower or uppercase letter, can
                include a whitespace, apostrophe, or hyphen, and can include
                any number of upper or lowercase characters.
               
    */
     
    private static String getValidName (int employeeNum) {
        Scanner scan = new Scanner (System.in);
        String s;
        
        do {
            System.out.print("Enter name of employee #" + (employeeNum) + 
                    " --> "); 
                s = scan.nextLine();
                } while (!s.matches("[A-Z][a-zA-Z]*" + " " + 
                        "[a-zA-z]+([ '-][a-zA-Z]+)*"));  
        return s;
    }
    
    /*
        getValidHireDate method returns the employee hire date as a Date object.
    
        A valid hire date:
            1) month value is 01 - 12,
            2) day value is 01 - 31,
            3) year value is 2000 - 2099.
    */
    private static Date getValidHireDate () {
        Scanner scan = new Scanner (System.in);
        Date hire;
        int month, day, year;
        String s;
                              
            do {
                System.out.print("Enter hire date in the format " +
                        "MM DD YYY with spacing --> ");
                s = scan.nextLine();    
                } while (!s.matches("(0[1-9]|1[0-2])" + " " + 
                "(0[1-9]|1[0-9]|2[0-9]|3[0-1])" + " " + "[2][0]\\d{2}"));
            
            // after hire date input is validated, split the String and
            // assign each integer to month, day, and year variables and
            // create the new Date object
            String [] dateSplit = s.split(" ");
            
            month = Integer.parseInt(dateSplit[0]);
            day = Integer.parseInt(dateSplit[1]);
            year = Integer.parseInt(dateSplit[2]);
            
            hire = new Date (month, day, year);
            
        return hire;
    }
    
    /*
        getValidDeptCode method returns the employee department code as an int.
    
        A valid department code:
            1) Has 4 digits
            2) Begins with a number 1-9
            3) Ends with 0
    */
    private static int getValidDeptCode () {
        Scanner scan = new Scanner (System.in);
        String s;
        int deptCode;
        
            do {
                System.out.print("Enter the department code in the " +
                        "format #### --> ");
                s = scan.nextLine();
                } while (!s.matches("[1-9][0-9][0-9]0"));
            deptCode = Integer.parseInt(s);
            
        return deptCode;
    }
    
}
