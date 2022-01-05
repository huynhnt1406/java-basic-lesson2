package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public String name;
    int streetNo;
    int age;
    String country;
    String district;
    public static void main(String[] args) {
	    Student[] students = new Student[2];
        List<Student> studentList = new ArrayList<>();
        students[0] = new Student("HUynh", 22, 48, "Viet Nam","Thanh Xuan");
        students[1] = new Student("Hyuh", 24, 20, "Viet Nam","Thanh Xuan");
        for(int i = 0 ; i < students.length ; i++){
            students[i].getInfo();
        }
//        System.out.println(studentList);
    }
}
