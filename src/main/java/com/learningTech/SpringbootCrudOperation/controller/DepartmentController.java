package com.learningTech.SpringbootCrudOperation.controller;

import com.learningTech.SpringbootCrudOperation.entity.Department01;
import com.learningTech.SpringbootCrudOperation.error.Department01NotFoundException;
import com.learningTech.SpringbootCrudOperation.service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    private final Logger Logger = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/lakshmi")
    public Department01 saveDepartment(@Valid @RequestBody Department01 department){
        Logger.info("Inside save department of Department Controller");
        return departmentService.saveDepartment(department);

    }

    @GetMapping("/lakshmi")
    public List<Department01> fetchAllDetails(){
        Logger.info("Inside Fetch details of Department Controller");
        return departmentService.fetchAllDetails();
    }

    @GetMapping("/departments/{id}")
    public Department01 getDepartmentByID(@PathVariable("id") Long departmentId) throws Department01NotFoundException {
        Logger.info("Inside fetch details by ID of Department Controller");
        return departmentService.getDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentByID(@PathVariable("id") Long departmentID){
        Logger.info("Inside delete department by ID of Department Controller");
        departmentService.deleteDepartmentByID(departmentID);
        return "Department deleted Successfully!!";
    }

    @PutMapping("/departments/{id}")
    public Department01 updateDepartment(@PathVariable("id") Long departmentID, @RequestBody Department01 department01){
        Logger.info("Inside update department of Department Controller");
            return departmentService.updateDepartment(departmentID,department01);
    }

    @GetMapping("/departments/name/{name}")
    public Department01 getDetailsByName(@PathVariable("name") String departmentName){
        return departmentService.getDetailsByName(departmentName);

    }

}
