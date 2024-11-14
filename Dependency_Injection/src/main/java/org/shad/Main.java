package org.shad;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appDependencyInjectionTest.xml");

        Student student = (Student) context.getBean("student");

        student.display();
    }
}