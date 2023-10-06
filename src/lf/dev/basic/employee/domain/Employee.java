package lf.dev.basic.employee.domain;

import java.util.Arrays;

public class Employee {
    String name;
    int age;
    double[] salary;

    public Employee(String name, int age, double[] salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void printData(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(Arrays.toString(this.salary));
        salaryAverage();
    }

    public void salaryAverage(){
        if (this.salary == null){
            return;
        }

        double sum = 0;
        double average;
        for (int i = 0; i < this.salary.length; i++) {
            sum += this.salary[i];
        }
        average = sum/salary.length;
        System.out.println("Salary average: "+ average);
    }

}