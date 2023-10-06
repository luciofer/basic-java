package lf.dev.basic.school.domain;

public class Professor {
    private String name;
    private int age;
    private String subject;

    public Professor(String name, int age, String subject){
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getSubject(){
        return this.subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public void showInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.subject);
    }


}
