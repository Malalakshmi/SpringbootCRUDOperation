package com.learningTech.SpringbootCrudOperation.repository;

import com.learningTech.SpringbootCrudOperation.entity.Department01;
import com.learningTech.SpringbootCrudOperation.service.DepartmentService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department01,Long> {
    public Department01 findByDepartmentName(String departmentName);


}
