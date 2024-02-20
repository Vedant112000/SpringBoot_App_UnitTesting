package com.example.project.HRManagementSystem.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;

    private String employeeName;

    private String gender;

    private double salary;

    private String position;

    private String collegeName;

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public Employee(Long employeeId, String employeeName, String gender, double salary, String position, String collegeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.gender = gender;
        this.salary = salary;
        this.position = position;
        this.collegeName = collegeName;
    }

    public Employee(String employeeName, String gender, double salary, String position, String collegeName) {
        this.employeeName = employeeName;
        this.gender = gender;
        this.salary = salary;
        this.position = position;
        this.collegeName = collegeName;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                ", collegeName='" + collegeName + '\'' +
                '}';
    }
}
