package edu.dp.sau.Kazarinov.O.V.model;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private Human head;
    private List<Group> groups;

    public Department(String name, Human head) {
        this.name = name;
        this.head = head;
        this.groups = new ArrayList<>();
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public String getName() {
        return name;
    }

    public void displayDepartmentInfo() {
        System.out.println("    Department: " + getName());
        System.out.println("    Head: " + head.getFirstName() + " " + head.getLastName());
        System.out.println("    Groups:");
        for (Group group : groups) {
            group.displayGroupInfo();
        }
    }
}
