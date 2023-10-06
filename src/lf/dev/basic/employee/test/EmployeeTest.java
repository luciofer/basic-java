package lf.dev.basic.employee.test;

import lf.dev.basic.employee.domain.Employee;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee = new Employee("PM", 44, new double[]{1000,5000,20000});
        employee.printData();
    }

}
