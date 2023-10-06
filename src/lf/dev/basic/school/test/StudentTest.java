package lf.dev.basic.school.test;

import lf.dev.basic.school.domain.ShowStudent;
import lf.dev.basic.school.domain.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        ShowStudent showstudent = new ShowStudent();

        student1.name = "PM";
        student1.age = 43;
        student1.country = "BR";

        student2.name = "FL";
        student2.age = 44;
        student2.country = "US";

        showstudent.show(student1);
        showstudent.show(student2);

        System.out.println("----------");
        System.out.println(student1.name);
        System.out.println(student2.name);

        System.out.println("----------");

        student1.print();
        System.out.println("----------");
        student2.print();
    }
}
