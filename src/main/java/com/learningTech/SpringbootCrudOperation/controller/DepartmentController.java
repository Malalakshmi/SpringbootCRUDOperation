package com.learningTech.SpringbootCrudOperation.controller;

import com.learningTech.SpringbootCrudOperation.entity.Department01;
import com.learningTech.SpringbootCrudOperation.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/lakshmi")
    public Department01 saveDepartment(@RequestBody Department01 department){
        return departmentService.saveDepartment(department);

    }

    @GetMapping("/lakshmi")
    public List<Department01> fetchAllDetails(){
        return departmentService.fetchAllDetails();
    }

    @GetMapping("/departments/{id}")
    public Department01 getDepartmentByID(@PathVariable("id") Long departmentId){
        return departmentService.getDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentByID(@PathVariable("id") Long departmentID){
        departmentService.deleteDepartmentByID(departmentID);
        return "Department deleted Successfully!!";
    }

    @PutMapping("/departments/{id}")
    public Department01 updateDepartment(@PathVariable("id") Long departmentID, @RequestBody Department01 department01){
            return departmentService.updateDepartment(departmentID,department01);
    }

    @GetMapping("/departments/name/{name}")
    public Department01 getDetailsByName(@PathVariable("name") String departmentName){
        return departmentService.getDetailsByName(departmentName);

    }

}
