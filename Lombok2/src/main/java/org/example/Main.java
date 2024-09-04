package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<LombokStudent> students = new ArrayList<>();

        students.add(new LombokStudent("1","Emil","Berlin","Major"));
        students.add(new LombokStudent("2","assane","Hamburg","low"));
        students.add(new LombokStudent("3","Mohamed","München","hight"));


        TeacherRecord teacherRecord = new TeacherRecord("10l","merlin","Math");

        TeacherRecord teacherRecord2 = new TeacherRecord("14","Sada","English");

        Course course = new Course("54","Verteilte","Dora",students);
        Course copy = course.withTeacher("Answer");

        Course course1 = new Course("54","Verteilte","Dora",students);


        System.out.println(students);
        System.out.println(course);
        System.out.println(copy);


        LombokStudent lombokStudent = LombokStudent.builder()
                .id("74")
                .name("Ulrich")
                .address("Stuttgart")
                .grade("level")
                .build();

        System.out.println(lombokStudent);


    }
}