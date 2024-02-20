package com.example.project.HRManagementSystem.Repository;

import com.example.project.HRManagementSystem.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
