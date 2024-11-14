package org.shad;

public class Student {
    private String name;
    private int roll;

    public Student(){

    }

    public Student(String name) {
        this.name = name;
    }

    public Student(int roll) {
        this.roll = roll;
    }

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public void display(){
        System.out.println(name + " " + roll);
    }
}
