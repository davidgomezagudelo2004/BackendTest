package com.api.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.backend.model.EmployeeModel;
import com.api.backend.services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeControl{

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/getAll")
    public List<EmployeeModel> obtainEmployeeList() {
        System.out.println(employeeService.obtainEmployeeList());
        return employeeService.obtainEmployeeList();
    }

    @PostMapping("/create")
    public EmployeeModel createEmployee(@RequestBody EmployeeModel employee) {
        return employeeService.createEmployee(employee);
    }

    @PutMapping("/edit/{id}")
    public EmployeeModel updateEmployee(@RequestBody EmployeeModel employee) {
        return employeeService.updateEmployee(employee);
    }
    
    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable int id) {
        employeeService.deleteEmployee(id);
    }
}

