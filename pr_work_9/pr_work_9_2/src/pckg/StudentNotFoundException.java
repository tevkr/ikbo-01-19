package pckg;

public class StudentNotFoundException extends Exception {
    StudentNotFoundException(String student)
    {
        super(student + " was not found.");
    }
}
