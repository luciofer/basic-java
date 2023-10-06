package lf.dev.basic.school.domain;

public class ShowStudent {
    public void show(Student student){
        System.out.println("----------");
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.country);
        student.name = "Changed name";
    }
}
