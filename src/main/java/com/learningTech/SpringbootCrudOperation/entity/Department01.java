package com.learningTech.SpringbootCrudOperation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department01 {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    private String departmentName;
    private String departmentBranch;
    private String departmentCode;
    private String departmentLocation;

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentBranch() {
        return departmentBranch;
    }

    public void setDepartmentBranch(String departmentBranch) {
        this.departmentBranch = departmentBranch;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getDepartmentLocation() {
        return departmentLocation;
    }

    public void setDepartmentLocation(String departmentLocation) {
        this.departmentLocation = departmentLocation;
    }

    public Department01(Long departmentId, String departmentName, String departmentBranch, String departmentCode, String departmentLocation) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
        this.departmentBranch = departmentBranch;
        this.departmentCode = departmentCode;
        this.departmentLocation = departmentLocation;
    }

    public Department01() {
    }

    @Override
    public String toString() {
        return "Department01{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", departmentBranch='" + departmentBranch + '\'' +
                ", departmentCode='" + departmentCode + '\'' +
                ", departmentLocation='" + departmentLocation + '\'' +
                '}';
    }
}
