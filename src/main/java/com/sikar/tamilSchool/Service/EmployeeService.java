package com.sikar.tamilSchool.Service;

import com.sikar.tamilSchool.exception.EmployeeNotFoundException;
import com.sikar.tamilSchool.model.Employee;
import com.sikar.tamilSchool.repos.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepo;

    public Employee addData(Employee emp){
        return employeeRepo.save(emp);
    }
    public List<Employee> getAllData(){
        return employeeRepo.findAll();
    }

    public Employee getData(Long id) {
         if (employeeRepo.existsById(id)) {
             return employeeRepo.findById(id).get();
         } else {
             throw new EmployeeNotFoundException("Employee not found for the id " + id);
         }
    }

    public Employee updateData(Employee emp){
        // upsert -> insert or update
        return employeeRepo.save(emp);
    }

    public String deleteData(Long id){
        if (employeeRepo.existsById(id)) {
            employeeRepo.deleteById(id);
            return "Deleted Successufully for the id " + id;
        } else {
            throw new RuntimeException("Employee not found for the id " + id);
        }

    }

}
