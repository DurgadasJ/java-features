package com.js.dm.service;
import com.js.dm.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class JavaService {

    // This service can be used to implement Java features

    @Autowired
    Employee employee;

    @Value("${employee.name}")
    String defaultName;


    public Employee executeJavaFeature() {
        System.out.println("Executing Java feature with default employee name: " + defaultName);
        // Example of using a Java feature
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("John Doe", "New York", 50000));
        employees.add(new Employee("Jane Smith", "Chicago", 60000));
        employees.add(new Employee("Alice Johnson", "Chicago", 70000));
        employees.add(new Employee("Bob Brown", "New York", 80000));
        employees.add(new Employee("Charlie White", "Phoenix", 90000));
        employees.add(new Employee("Diana Green", "New York", 55000));
        employees.add(new Employee("Ethan Blue", "San Jose", 75000));
        employees.add(new Employee("Fiona Black", "San Diego", 65000));
        employees.add(new Employee("George Yellow", "Phoenix", 85000));
        employees.add(new Employee("Hannah Purple", "San Jose", 95000));

        employees.stream()
                .collect(Collectors.groupingBy(Employee::getCity,
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))))
                .forEach((city, employee) -> System.out.println(city + ": " + employee.orElse(null)));

        Map<String, Optional<Employee>> maxSalaryByCity =employees.stream().
                collect(Collectors.groupingBy(Employee::getCity, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

        System.out.println(maxSalaryByCity);

        Optional<Employee> highestPaid = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                .findFirst();


        // want to get list of employee by cities

        Map<String, List<Employee>> empByCity = employees.stream().collect(Collectors.groupingBy(Employee::getCity));

        System.out.println(empByCity);

        System.out.println(highestPaid);// You can add more complex logic here
        // For example, using streams, lambdas, etc.
        
        return highestPaid.orElse(new Employee("No Employee", "Unknown", 0));
    }
}
