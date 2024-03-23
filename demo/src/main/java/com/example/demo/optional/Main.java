package com.example.demo.optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

//        List<Student> list = new ArrayList<>();
//        traverse(Arrays.asList(new Student()));
        Optional<Student> optionalStudent = Optional.ofNullable(null);
        Student student = new Student(20, "Peter");
        student.setGrade(new Grade("MATH", 99));
        traverse2(student);
    }

    public static void traverse2(Student student) {
        if (student == null) return;
        if (student.getGrades() == null) return;
        if (student.getGrades().getSubject() == null) return;
        System.out.println(student.getGrades().getSubject().toLowerCase());
    }

    public static void traverse(Student student) {
        Optional.ofNullable(student).map(Student::getGrades).map(Grade::getSubject).map(String::toLowerCase).ifPresent(System.out::println);
    }
}
