package com.example.project.HRManagementSystem.Repository;

import com.example.project.HRManagementSystem.Models.College;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollegeRepository extends JpaRepository<College, Long> {
}
