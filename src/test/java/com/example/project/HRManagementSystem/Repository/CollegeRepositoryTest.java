package com.example.project.HRManagementSystem.Repository;

import com.example.project.HRManagementSystem.Models.College;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class CollegeRepositoryTest {

    @Autowired
    private CollegeRepository collegeRepository;



    @Test
    public void collegeRepository_AddCollege_CheckingIfCollegeAddedIntoDataBase(){

        //Arrange

        College expectedCollege = new College("VMP", "asangaon", 12);

        //act

        College result = collegeRepository.save(expectedCollege);

        //assert

        Assertions.assertEquals(expectedCollege, result);
    }

    @Test
    public void collegeRepository_GetAllCollege_CheckingIfAllCollegesAreRetrieved(){

        //Act

        List<College> expectedResult = collegeRepository.findAll();

        //Assert

        Assertions.assertFalse(expectedResult.isEmpty(), "Result should not be empty");


    }

    @Test
    public void collegeRepository_GetCollege_CheckingIfCollegesIsRetrieved(){
        //Act

        Long collegeId = 3L;

        //Act

        Optional<College> college = collegeRepository.findById(collegeId);

        //Assert

        Assertions.assertTrue(college.isPresent(), "College should be present");
    }

}