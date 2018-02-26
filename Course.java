
/**
 * This program creates a class called Course, which holds various
 * functionalities for creating a course and filling it with students.
 * Exam 1
 * 
 * @author Marcy Held
 * Date: 02-24-16
 */
public class Course {
    private String courseName;
    private String [] students;
    private int numberOfStudents;
    private int studentLimit;
    
    // Constructor
    public Course (String courseName, int limit) {
        this.courseName = courseName;
        studentLimit = limit;
        students = new String [2];
        numberOfStudents = 0;    
}
    public String getCourseName() {  
        return courseName;    
    }
    
    // addStudent method adds a student name to the students array
    // 1) if numberOfStudents equals length of students array AND 
    //     numberOfStudents is still less than studentLimit, increaseSize();
    //     method is called, one space is added to the students array, and
    //     the student name is added to the array
    // 2) if numberOfStudents equals studentLimit, student name is not
    //    added (no space left in the course) and error message prints
    public void addStudent (String student) {

        // if (isAvailableRoom()) {
        //  if (numberOfStudents == students.length) {
        //          increaseSize();
        //   }
        // students[numberOfStudents]
        if (numberOfStudents < students.length &&
                numberOfStudents < studentLimit) 
        {
            students[numberOfStudents] = student;
            numberOfStudents++;  
        }
                
        else if (numberOfStudents == students.length &&
                    numberOfStudents < studentLimit) 
        {
            increaseSize(); 
            students[numberOfStudents] = student;
            numberOfStudents++;
        }
        
        else               
            System.out.println("Course is full, cannot add student");  
    }
    
    // increaseSize method adds 1 space to students array
    private void increaseSize () {
        
        String [] temp = new String [students.length + 1];
        System.arraycopy(students, 0, temp, 0, students.length);
        students = temp;
    }
    
    // returns true when numberOfStudents is less than the studentLimit
    public boolean isAvailableRoom () {
        
        if (numberOfStudents < studentLimit)
            return true;
        else
            return false;
        // return studentLimit > numberOfStudents
    }
    
    // finds specified student name in the students array and removes
    // that name from the array.
    // shifts all elements of students array forward so there are no spaces.
    // reduces the number of students.
    public void dropStudent(String student) {
        
        for (int i = 0; i < students.length; i++) {
            if (student.equals(students[i])) {
                
                for (int k = i; k < (students.length - 1); k++) {
                    students[k] = students[k + 1];
                }
                //numberOfStudents--;
                students[(students.length - 1)] = "";
                //break; --> to break out of outer for loop, do not continue to
                //      look for a match
            }  
        }
        numberOfStudents--;
    }
    
    // returns a copy of the students array
    public String[] getStudents () {
        
        String [] studentsCopy = new String [students.length];
        System.arraycopy(students, 0, studentsCopy, 0, students.length);
        
        return studentsCopy;   
    }
    
    public int getNumberOfStudents () {
        return numberOfStudents;
    }
    
    public int getStudentLimit () {
        return studentLimit;
    }
    
    // clears all student names from students array and resets number of
    // students to 0
    public void clear () {
        
        for (int i = 0; i < students.length; i++) {
            students[i] = null;
        }
        
        numberOfStudents = 0;
    }
}
