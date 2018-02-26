
/**
 * This is the driver file for the Course class (Exam 1).
 * 
 * @author Marcy Held
 * Date: 02-24-16
 */
public class TestCourse {

    public static void main(String[] args) {
        // create 2 courses
        Course course1 = new Course ("Data Structures", 15);
        Course course2 = new Course ("Database Systems", 17);
        // add students to Data Structures
        course1.addStudent("Peter Jones");
        course1.addStudent("Brian Smith");
        course1.addStudent("Anne Kennedy");
        course1.addStudent("Susan Kennedy");
        course1.addStudent("John Kennedy");
        course1.addStudent("Kim Johnson");
        course1.addStudent("S1");
        course1.addStudent("S2");
        course1.addStudent("S3");
        course1.addStudent("S4");
        course1.addStudent("S5");
        course1.addStudent("S6");
        course1.addStudent("S7");
        course1.addStudent("S8");
        course1.addStudent("S9");
        //course1.addStudent("test");
        // add students to Database Systems
        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");
        //course2.addStudent("test");
                
        // display the number of students currently in Data Structures
        System.out.println("Number of students in " + course1.getCourseName()
            + ": " + course1.getNumberOfStudents());
        
        // test reference
        String [] students = course1.getStudents();
        students[0] = "garbage";
        // display students array
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students[i] + ", ");
        }
        
        // display the number of students currently in Database Systems
        System.out.println();
        System.out.println("Number of students in " + course2.getCourseName()
            + ": " + course2.getNumberOfStudents());
        
        // add a student to Data Structures course
        course1.addStudent("S10");
        // drop a student from Data Structures course
        course1.dropStudent("S1");
        //check for limit reached for this course
        
        System.out.println("Available seat in Data Structures: " +
                course1.isAvailableRoom());
        // add a student to Data Structures
        course1.addStudent("S10");
        // display students
        students = course1.getStudents();
        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students[i] + ", ");
        }
        // clear the course
        course1.clear();
        System.out.println("\nNumber of students in " + course1.getCourseName()
            + ": " + course1.getNumberOfStudents());
        // display the cleared course content
        students = course1.getStudents();
        for (int i = 0; i < students.length; i++) {
            System.out.print(students[i] + ", ");
        }
        System.out.println();
                
    }
    
}
