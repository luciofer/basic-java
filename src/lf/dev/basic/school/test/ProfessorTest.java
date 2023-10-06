package lf.dev.basic.school.test;

import lf.dev.basic.school.domain.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Captain", 44, "Physics");
        Professor professor2 = new Professor("Lessa", 43, "APH");

        String test;

        professor1.showInfo();
        System.out.println("------------");
        professor2.showInfo();

        Professor professorTest;
        professorTest = professor1;

        System.out.println("------------");
        professor1 = professor2;
        professor1.showInfo();
        professor2.showInfo();
        System.out.println("------------");
        professorTest.showInfo();
    }
}