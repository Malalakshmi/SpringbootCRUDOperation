package com.learningTech.SpringbootCrudOperation.service;

import com.learningTech.SpringbootCrudOperation.entity.Department01;
import com.learningTech.SpringbootCrudOperation.error.Department01NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DepartmentService {
   public  Department01 saveDepartment(Department01 department);

  public  List<Department01> fetchAllDetails();

  public Department01 getDepartmentById(Long departmentId) throws Department01NotFoundException;

    public void deleteDepartmentByID(Long departmentID);

   public Department01 updateDepartment(Long departmentID, Department01 department01);

   public Department01 getDetailsByName(String departmentName);
}
