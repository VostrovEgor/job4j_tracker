package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivan Ivanov");
        student.setNumber("1-B");
        student.setCreated("07/02/2024");

        System.out.println(student.getFullName() + " " + student.getNumber() + " " + student.getCreated());
    }
}
