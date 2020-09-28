package pckg;


public class Student implements Comparable<Student>{
    private static int count = 0;
    private int idNumber;
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private int mark;
    public Student(String firstName,String middleName,String lastName, int age, int mark) throws EmptyStringException {
        if (firstName.isEmpty() || middleName.isEmpty() || lastName.isEmpty())
            throw new EmptyStringException();
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.mark = mark;
        idNumber = count;
        count++;
    }
    public int getAge() {
        return age;
    }
    public int getIdNumber() {
        return idNumber;
    }
    public int getMark() {
        return mark;
    }
    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public int compareTo(Student student) {
        return (this.mark - student.mark);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }
}
