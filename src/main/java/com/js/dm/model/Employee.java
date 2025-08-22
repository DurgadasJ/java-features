package com.js.dm.model;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    private String name;

    private String city;

    private int salary;


    public Employee() {
        // Default constructor
    }

    public Employee(String name, String city, int salary) {
        this.name = name;
        this.city = city;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

}
