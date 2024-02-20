package com.example.project.HRManagementSystem.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class College {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long collegeId;

    private String collegeName;

    private String collegeAddress;

    private long collegeRegisteredNo;

    public Long getCollegeId() {
        return collegeId;
    }

    public void setCollegeId(Long collegeId) {
        this.collegeId = collegeId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeAddress() {
        return collegeAddress;
    }

    public void setCollegeAddress(String collegeAddress) {
        this.collegeAddress = collegeAddress;
    }

    public long getCollegeRegisteredNo() {
        return collegeRegisteredNo;
    }

    public void setCollegeRegisteredNo(long collegeRegisteredNo) {
        this.collegeRegisteredNo = collegeRegisteredNo;
    }

    public College(Long collegeId, String collegeName, String collegeAddress, long collegeRegisteredNo) {
        this.collegeId = collegeId;
        this.collegeName = collegeName;
        this.collegeAddress = collegeAddress;
        this.collegeRegisteredNo = collegeRegisteredNo;
    }

    public College(String collegeName, String collegeAddress, long collegeRegisteredNo) {
        this.collegeName = collegeName;
        this.collegeAddress = collegeAddress;
        this.collegeRegisteredNo = collegeRegisteredNo;
    }

    public College() {
    }


}
