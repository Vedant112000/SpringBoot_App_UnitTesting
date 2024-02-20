package com.example.project.HRManagementSystem.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    private String studentName;

    private String gender;

    private String college;

    private int admissionYear;

    private String caste;

    private String course;

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getAdmissionYear() {
        return admissionYear;
    }

    public void setAdmissionYear(int admissionYear) {
        this.admissionYear = admissionYear;
    }

    public String getCaste() {
        return caste;
    }

    public void setCaste(String caste) {
        this.caste = caste;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Student(Long studentId, String studentName, String gender, String college, int admissionYear, String caste, String course) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.gender = gender;
        this.college = college;
        this.admissionYear = admissionYear;
        this.caste = caste;
        this.course = course;
    }

    public Student(String studentName, String gender, String college, int admissionYear, String caste, String course) {
        this.studentName = studentName;
        this.gender = gender;
        this.college = college;
        this.admissionYear = admissionYear;
        this.caste = caste;
        this.course = course;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", gender='" + gender + '\'' +
                ", college='" + college + '\'' +
                ", admissionYear=" + admissionYear +
                ", caste='" + caste + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
