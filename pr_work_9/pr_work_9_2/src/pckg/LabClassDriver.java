package pckg;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LabClassDriver implements LabClassUI {
    private ArrayList<Student> students = new ArrayList<>();
    @Override
    public Student getStudent(String firstName, String middleName, String lastName) throws StudentNotFoundException {
        for (Student s: students) {
            if (s.getFirstName().equals(firstName) && s.getMiddleName().equals(middleName) && s.getLastName().equals(lastName))
                return s;
        }
        throw new StudentNotFoundException(firstName + " " + middleName + " " + lastName);
    }
    @Override
    public void addStudent(Student student){
        students.add(student);
    }
    @Override
    public void sortStudents()
    {
        students.sort(Comparator.comparing(Student::getMark));
    }
    @Override
    public String toString() {
        String listOfStudents = "";
        int count = 0;
        for (Student s: students) {
            count++;
            listOfStudents += count + ". " + s.getLastName() + " " + s.getFirstName() + " " + s.getMiddleName() + "\n";
        }
        return "LabClassDriver{" +
                "students=\n" + listOfStudents +
                '}';
    }
}
