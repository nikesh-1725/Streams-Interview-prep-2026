package com.example.Capgemini;

public class Employee {
    String name;
    String departments;
    double salary;

    public Employee(String name, String departments, double salary) {
        this.name = name;
        this.departments = departments;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departments='" + departments + '\'' +
                ", salary=" + salary +
                '}';
    }
}
