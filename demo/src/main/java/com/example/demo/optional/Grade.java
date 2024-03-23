package com.example.demo.optional;

public class Grade {

    private String subject;

    private int value;

    public Grade(String subject, int value) {
        this.subject = subject;
        this.value = value;
    }

    public Grade(int value) {
        this.value = value;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
