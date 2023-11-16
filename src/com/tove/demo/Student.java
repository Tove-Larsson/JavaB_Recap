package com.tove.demo;

public class Student {

    private int age;

    private String name;
    private int score;
    private boolean isHangry;
    private char grade;
    private Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHangry() {
        return isHangry;
    }

    public void setHangry(boolean hangry) {
        isHangry = hangry;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", isHangry=" + isHangry +
                ", grade=" + grade +
                '}';
    }
}
