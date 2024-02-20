package com.example.project.HRManagementSystem.Service;


import com.example.project.HRManagementSystem.Models.Employee;
import com.example.project.HRManagementSystem.Repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public void addEmployee(Employee employee){
        employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }

    public Employee getEmployee(Long employeeId){
        return employeeRepository.findById(employeeId).orElse(null);
    }

    public String deleteEmployee(Long employeeId){
        try{
            employeeRepository.deleteById(employeeId);
            return "Deleted Successfully";
        }catch(Exception e){
            return "Error Occured while deleting";
        }
    }
}
