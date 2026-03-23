package com.example.MediumWebsite;
import java.util.HashMap;
import java.util.Map;


class Employee {
    int id;
    String name;

    String department;

    double salary;

    // Constructor to initialize Employee object
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        return id + name.hashCode(); // Hash code based on id and name
    }
    //
//    // Override equals() to compare Employee objects based on id and name
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same reference check
        if (obj == null || getClass() != obj.getClass()) return false; // Null check and class type check
        Employee employee = (Employee) obj;
        return id == employee.id && name.equals(employee.name); // Compare id and name
    }

    // Override toString() for better representation

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class HashMapOverritesExample {
    public static void main(String[] args) {
        Map<Employee, Integer> salaryMap=new HashMap<>();
        HashMapOverritesExample  overritesExample=new HashMapOverritesExample();
        System.out.println(overritesExample.getClass());
        overritesExample.getData();
        salaryMap.put(new Employee(1, "Ram"), 1000); // Adding first employee
        salaryMap.put(new Employee(1, "Ram"), 200);
        Employee obj=new Employee(2, "Nikesh");
        Employee employee=new Employee(1, "Ram");
        Employee emp= obj;
        System.out.println(obj.getId());
        // Adding second employee (same id and name)
        // Retrieving the salary using the same Employee object (id=1, name="Ram")
        System.out.println("Salary of employee Ram: " + salaryMap.get(new Employee(1, "Ram")));
    }
    private void getData() {

        System.out.println(getClass());
    }
}
