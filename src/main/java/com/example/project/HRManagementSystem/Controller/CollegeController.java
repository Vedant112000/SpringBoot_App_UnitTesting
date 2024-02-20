package com.example.project.HRManagementSystem.Controller;

import com.example.project.HRManagementSystem.Models.College;
import com.example.project.HRManagementSystem.Service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/college")
public class CollegeController {

    @Autowired
    private CollegeService collegeService;

    @PostMapping("/add")
    @ResponseBody
    public ResponseEntity<?> addCollege(@RequestBody College college){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(collegeService.addCollege(college));
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Error Occured");
        }
    }


    @GetMapping("/get/all")
    @ResponseBody
    public ResponseEntity<?> getAllCollege(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(collegeService.getAllCollege());
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Error Occured");
        }
    }

    @GetMapping("/get/{collegeId}")
    @ResponseBody
    public ResponseEntity<?> getCollege(@PathVariable Long collegeId){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(collegeService.getCollege(collegeId));
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Error Occured");
        }
    }

    @DeleteMapping("/delete/{collegeId}")
    @ResponseBody
    public ResponseEntity<?> deleteCollege(@PathVariable Long collegeId){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(collegeService.deleteCollege(collegeId));
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Error Occured");
        }
    }
}
