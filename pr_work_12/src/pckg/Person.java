package pckg;

public class Person {
    private String firstName, middleName, lastName;

    public Person(String lastName) {
        this.lastName = lastName;
    }
    public Person(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        if (firstName == null || middleName == null)
            return this.lastName;
        else
            return this.lastName + " " + this.firstName + " " + this.middleName;
    }

}
