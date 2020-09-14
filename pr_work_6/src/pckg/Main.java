package pckg;

public class Main {

    public static void main(String[] args) {
	    //ex1
        Student st1 = new Student("Misha", 19,5);
        Student st2 = new Student("Sasha", 20,4);
        Student st3 = new Student("Petya", 21,3);
        Student st4 = new Student("Vasya", 18,4);
        Student st5 = new Student("Igor", 17,5);

        Student[] students ={st2,st3,st5,st1,st4};
        insertionSort(students);
        for (Student s : students)
            System.out.print(s.getName() + " ");
        System.out.println("\n");
        //ex2
        SortingStudentsByGPA ssbg = new SortingStudentsByGPA();
        ssbg.quickSort(students,0,students.length-1);
        for (Student s : students)
            System.out.print(s.getName() + " ");
        System.out.println("\n");
        //ex3
        Merge_ex3 me3 = new Merge_ex3();
        students = me3.sortMerge(students);
        for (Student s : students)
            System.out.print(s.getName() + " ");
    }
    public static void insertionSort(Student[]students) {

        for (int i = 1; i < students.length; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getIdNumber()> key.getIdNumber()) {
                students[j + 1]= students[j];
                j = j - 1;
            }
            students[j + 1]= key;
        }
    }
}
