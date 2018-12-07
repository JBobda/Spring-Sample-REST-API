package dev.janbobda.controller;

import dev.janbobda.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    List<Employee> employeeList = new ArrayList<>();

    public EmployeeController(){
        employeeList.add(new Employee(0, "Mike", "Hunt", "Cashier", 16));
        employeeList.add(new Employee(1, "John", "Smith", "Manager", 25));
        employeeList.add(new Employee(2, "Ryan", "Johnson", "Janitor", 57));
    }

    @GetMapping("")
    public List<Employee> getAllEmployees(){
        return employeeList;
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable long id){
        return employeeList.stream().filter(e -> e.getId() == id).findAny().orElse(null);
    }
}
