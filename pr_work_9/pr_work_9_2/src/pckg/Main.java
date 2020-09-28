package pckg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws EmptyStringException, StudentNotFoundException {
        LabClassUI classUI = new LabClass().getClassUi();
        classUI.addStudent(new Student("a", "b",  "c", 18, 4));
        classUI.addStudent(new Student("d", "e",  "f", 19, 3));
        classUI.addStudent(new Student("g", "h",  "i", 18, 2));
        classUI.addStudent(new Student("j", "k",  "l", 19, 1));
        System.out.println(classUI);
        classUI.sortStudents();
        System.out.println(classUI);
        Scanner scan = new Scanner(System.in);
        System.out.println(classUI.getStudent(scan.next(), scan.next(), scan.next()));
    }
}
