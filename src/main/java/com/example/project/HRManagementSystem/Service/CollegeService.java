package com.example.project.HRManagementSystem.Service;


import com.example.project.HRManagementSystem.Models.College;
import com.example.project.HRManagementSystem.Repository.CollegeRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class CollegeService {

    private CollegeRepository collegeRepository;

    public CollegeService(CollegeRepository collegeRepository) {
        this.collegeRepository = collegeRepository;
    }


    public String addCollege(College college){
        collegeRepository.save(college);
        return "Added Successfully";
    }

    public List<College> getAllCollege(){
        return collegeRepository.findAll();
    }

    public College getCollege(Long collegeId){
        return collegeRepository.findById(collegeId).orElse(null);
    }

    public String deleteCollege(Long collegeId){
        collegeRepository.deleteById(collegeId);
        return "deleted Successfully";
    }
}
