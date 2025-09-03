package com.example.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {

    @GetMapping("/employee")
    public Employee getEmployee() {
        Employee employee = new Employee();
        employee.setId(101);
        employee.setName("John Doe");
        employee.setDepartment("Engineering");
        return employee;
    }
}

class Employee {
    private int id;
    private String name;
    private String department;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}