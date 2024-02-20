package com.example.project.HRManagementSystem.Service;


import com.example.project.HRManagementSystem.Models.Student;
import com.example.project.HRManagementSystem.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public String addStudent(Student student){
        studentRepository.save(student);
        return "Added Successfully";
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student getStudent(Long studentId){
        return studentRepository.findById(studentId).orElse(null);
    }

    public String deleteStudent(Long studentId){
        studentRepository.deleteById(studentId);
        return "Deleted Successfully";
    }
}
