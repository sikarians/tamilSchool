
package com.sikar.tamilSchool.controller;

import com.sikar.tamilSchool.Service.EmployeeService;
import com.sikar.tamilSchool.model.Student;
import com.sikar.tamilSchool.repos.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.sikar.tamilSchool.model.Employee;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/createEmployee")
    public String addValues(@RequestBody Employee emp) {
        employeeService.addData(emp);
        return "employee list added";
    }
    @GetMapping("/officeEmp/{id}")
    public List<Employee> getValues(@PathVariable Integer id) {
        return employeeService.getData(id);
    }

    @GetMapping("/officeEmp/id")
    public Optional<Employee> getAllValues() {
        return employeeService.getData(id);
    }

    @PutMapping("/officeEmp")
    public Employee updateValues(@RequestBody Employee emp) {
        return employeeService.updateData(emp);
    }

    @DeleteMapping("/officeEmp/{id}")
    public string deleteValues(@PathVariable Integer id) {
        return employeeService.deleteData(id);
    }
}





























