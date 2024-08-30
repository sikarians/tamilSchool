package com.sikar.tamilSchool.Service;

import org.springframework.beans.factory.annotation.Autowired;

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

    public Optional<Employee> getData(Integer id){
        return employeeRepo.findById(id);
    }

    public Employee updateData(Employee emp){
        return employeeRepo.save(emp);
    }

    public String deleteData(Integer id){
        employeeRepo.deleteById(id);

        return "Deleted Successufully for the id " + id;

    }

}
