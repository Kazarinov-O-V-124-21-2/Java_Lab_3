package edu.dp.sau.Kazarinov.O.V.model;

import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private String name;
    private Human head;
    private List<Department> departments;

    public Faculty(String name, Human head) {
        this.name = name;
        this.head = head;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public String getName() {
        return name;
    }

    public void displayFacultyInfo() {
        System.out.println("  Faculty: " + getName());
        System.out.println("  Head: " + head.getFirstName() + " " + head.getLastName());
        System.out.println("  Departments:");
        for (Department department : departments) {
            department.displayDepartmentInfo();
        }
    }
}