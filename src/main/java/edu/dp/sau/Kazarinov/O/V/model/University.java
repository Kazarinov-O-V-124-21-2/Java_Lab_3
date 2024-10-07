package edu.dp.sau.Kazarinov.O.V.model;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private Human head;
    private List<Faculty> faculties;

    public University(String name, Human head) {
        this.name = name;
        this.head = head;
        this.faculties = new ArrayList<>();
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public String getName() {
        return name;
    }

    public Human getHead() {
        return head;
    }

    public void displayUniversityInfo() {
        System.out.println("University: " + getName());
        System.out.println("Head: " + head.getFirstName() + " " + head.getLastName());
        System.out.println("Faculties:");
        for (Faculty faculty : faculties) {
            faculty.displayFacultyInfo();
        }
    }
}
