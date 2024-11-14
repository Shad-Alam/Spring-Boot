package org.shad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        Employee employee = (Employee) context.getBean("employee");

        employee.setName("Shad Joy");
        employee.setAddress("Dhaka, Bangladesh");

        System.out.println(employee.getName());
        System.out.println(employee.getAddress());
    }
}