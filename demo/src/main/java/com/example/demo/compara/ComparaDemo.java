package com.example.demo.compara;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparaDemo {

    public static void main(String[] args) {
        Comparator<Student> comparator = (s1, s2) -> s2.getGrade() - s1.getGrade();
        Student abby = new Student(2, 90, "abby");
        Student bob = new Student(0, 80, "bob");
        Student carl = new Student(1, 90, "carl");

        List<Student> studentList = new ArrayList() {{
            add(abby);
            add(bob);
            add(carl);
        }};

        Collections.sort(studentList);

        System.out.println(studentList);

        Collections.sort(studentList, comparator);

        System.out.println(studentList);
    }

}
