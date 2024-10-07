package edu.dp.sau.Kazarinov.O.V.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private Human head;
    private List<Student> students;

    public Group(String name, Human head) {
        this.name = name;
        this.head = head;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public void displayGroupInfo() {
        System.out.println("      Group: " + getName());
        System.out.println("      Head: " + head.getFirstName() + " " + head.getLastName());
        System.out.println("      Students:");
        for (Student student : students) {
            System.out.println("        " + student.getFirstName() + " " + student.getLastName());
        }
    }
}
