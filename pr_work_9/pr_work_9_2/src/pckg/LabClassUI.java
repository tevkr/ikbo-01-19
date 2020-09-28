package pckg;

import java.util.List;

public interface LabClassUI {
    Student getStudent(String firstName,String middleName,String lastName) throws StudentNotFoundException;
    void addStudent(Student student);
    void sortStudents();
}
