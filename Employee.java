
/**
 *
 * @author Marcy Held
 * Date: 02-25-16
 * Updated: 03-02-16
 */
import java.text.DecimalFormat;

public class Employee {
    private String name;
    private Date hireDate;
    private int departmentCode;
    private static int numberOfEmployees;
    
    public Employee () {
        name = "No name";
        hireDate = new Date (1, 1, 2000);
        departmentCode = 0000;
        numberOfEmployees++;
    }
    
    public Employee (String theName, Date theDate, int theDeptCode) {
        
        if (theName == null || theDate == null) {
            System.out.println("Fatal Error creating employee.");
            System.exit(0);
        }
        
        name = theName;
        hireDate = new Date (theDate); // Dates are class-level objects, need
                                       // return a copy for security reasons.
        departmentCode = theDeptCode;
        numberOfEmployees++;   
    }
    
    // creates a copy of an Employee object
    public Employee (Employee originalObject) {
        name = originalObject.name;
        hireDate = new Date (originalObject.hireDate);
        departmentCode = originalObject.departmentCode;
        numberOfEmployees++;
    }
    
    public String getName () {
        return name;
    }
    
    // return a COPY of hireDate!!!
    // all class-level variables, we need to return a copy of that object
    public Date getHireDate() {
        return new Date(hireDate);
    }
    
    public int getDepartmentCode() {
        return departmentCode;
    }
    
    public static int getNumberOfHired() {
        return numberOfEmployees;
    }
    
    public void setName (String newName) {
        if (newName == null) {
            System.out.println("Fatal Error setting employee name.");
            System.exit(0);
        }
        else
            name = newName;
    }
    
    public void setHireDate (Date newDate) {
        if (newDate == null) {
            System.out.println("Fatal Error setting employee hire date.");
            System.exit(0);
        }
        else
            hireDate = new Date(newDate);
    }
    
    public void setDepartmentCode (int newCode) {
        departmentCode = newCode;
    }

    public String toString() {
        
        DecimalFormat df = new DecimalFormat ("0000");
        return  ("Name: " + name +
                "\nHire date: " + hireDate.toString() +
                "\nDepartment Code: " + df.format(departmentCode));
        
    }

    public boolean equals(Object otherObject) {
        
        // check to see if otherObject exists
        if (otherObject == null)
            return false;
        
        // check to see if otherObject is an Employee object
        else if (!(otherObject instanceof Employee))
            return false;

        // compare fields of the 2 Employee objects
        else
        {
            Employee otherEmployee = (Employee)otherObject;
            return (name.equals(otherEmployee.name)
                    && hireDate.equals(otherEmployee.hireDate)
                    && departmentCode == otherEmployee.departmentCode);
        }   
    }
}
