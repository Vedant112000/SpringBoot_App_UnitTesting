package com.example.project.HRManagementSystem.Controller;

import com.example.project.HRManagementSystem.Models.Employee;
import com.example.project.HRManagementSystem.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;


    @PostMapping("/add")
    @ResponseBody
    public ResponseEntity<?> addEmployee(@RequestBody Employee employee){
        try{
            employeeService.addEmployee(employee);
            return ResponseEntity.status(HttpStatus.OK).body("Successfully added");
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Error occured");
        }
    }

    @GetMapping("/get/all")
    @ResponseBody
    public ResponseEntity<?> getAllEmployee(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(employeeService.getAllEmployee());
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Error occured");
        }
    }

    @GetMapping("/get/{employeeId}")
    @ResponseBody
    public ResponseEntity<?> getEmployee(@PathVariable Long employeeId){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(employeeService.getEmployee(employeeId));
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Error occured");
        }
    }

    @DeleteMapping("/delete/{employeeId}")
    @ResponseBody
    public ResponseEntity<?> deleteEmployee(@PathVariable Long employeeId){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(employeeService.deleteEmployee(employeeId));
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Error occured");
        }
    }
}
