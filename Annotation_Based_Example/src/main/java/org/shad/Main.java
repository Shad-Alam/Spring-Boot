package org.shad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(EmployeeConfigAnnotation.class);

        Employee employee = (Employee) context.getBean("emp");

        employee.setName("Shad");
        employee.setAddress("DOHS");

        System.out.println(employee.getName());
        System.out.println(employee.getAddress());
    }
}