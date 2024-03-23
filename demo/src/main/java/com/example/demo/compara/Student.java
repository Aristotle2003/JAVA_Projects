package com.example.demo.compara;

public class Student implements Comparable<Student> {
    private int id;
    private int grade;
    private String name;

    public Student(int id, int grade, String name) {
        this.id = id;
        this.grade = grade;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return this.id - o.getId() == 0 ? this.name.compareTo(o.getName()) : this.id - o.id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", grade=" + grade +
                ", name='" + name + '\'' +
                '}';
    }
}
