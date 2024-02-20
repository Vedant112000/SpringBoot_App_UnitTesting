package com.example.project.HRManagementSystem.Controller;

import com.example.project.HRManagementSystem.Models.Student;
import com.example.project.HRManagementSystem.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    @ResponseBody
    public ResponseEntity<?> addStudent(@RequestBody Student student){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(studentService.addStudent(student));
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Error Occured");
        }
    }

    @GetMapping("/get/all")
    @ResponseBody
    public ResponseEntity<?> getAllStudents(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(studentService.getAllStudents());
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Error Occured");
        }
    }

    @GetMapping("/get/{studentId}")
    @ResponseBody
    public ResponseEntity<?> getStudent(@PathVariable Long studentId){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(studentService.getStudent(studentId));
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Error Occured");
        }
    }


    @DeleteMapping("/delete/{studentId}")
    @ResponseBody
    public ResponseEntity<?> deleteStudent(@PathVariable Long studentId){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(studentService.deleteStudent(studentId));
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Error Occured");
        }
    }
}
