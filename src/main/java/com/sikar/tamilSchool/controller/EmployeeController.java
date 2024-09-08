
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
    private EmployeeService employeeService;

    @Autowired
    EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/createEmployee")
    public Employee createEmployee(@RequestBody Employee emp) {
        return employeeService.addData(emp);
    }
    @GetMapping("/officeEmp/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return employeeService.getData(id);
    }

    @GetMapping("/officeEmp/id")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllData();
    }

    @PutMapping("/officeEmp")
    public Employee updateValues(@RequestBody Employee emp) {
        return employeeService.updateData(emp);
    }

    @DeleteMapping("/officeEmp/{id}")
    public String deleteValues(@PathVariable Long id) {
        return employeeService.deleteData(id);
    }
}





























