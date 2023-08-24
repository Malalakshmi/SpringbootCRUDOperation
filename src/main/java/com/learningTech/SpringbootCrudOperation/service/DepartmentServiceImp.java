package com.learningTech.SpringbootCrudOperation.service;

import com.learningTech.SpringbootCrudOperation.entity.Department01;
import com.learningTech.SpringbootCrudOperation.error.Department01NotFoundException;
import com.learningTech.SpringbootCrudOperation.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentServiceImp implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department01 saveDepartment(Department01 department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department01> fetchAllDetails() {
        return departmentRepository.findAll();
    }

    @Override
    public Department01 getDepartmentById(Long departmentId) throws Department01NotFoundException {
        Optional<Department01> department = departmentRepository.findById(departmentId);
        if(!department.isPresent()){
            throw new Department01NotFoundException("Department Not Available");
        }
        return department.get();
    }

    @Override
    public void deleteDepartmentByID(Long departmentID) {
        departmentRepository.deleteById(departmentID);
    }

    @Override
    public Department01 updateDepartment(Long departmentID, Department01 department01) {
        Department01 deDB = departmentRepository.findById(departmentID).get();
        if(Objects.nonNull(department01.getDepartmentName()) && !"".equalsIgnoreCase(department01.getDepartmentName())){
            deDB.setDepartmentName(department01.getDepartmentName());

        }
        if(Objects.nonNull(department01.getDepartmentLocation()) && !"".equalsIgnoreCase(department01.getDepartmentLocation())){
            deDB.setDepartmentLocation(department01.getDepartmentLocation());
        }
        if(Objects.nonNull(department01.getDepartmentCode()) && !"".equalsIgnoreCase(department01.getDepartmentCode())){
            deDB.setDepartmentCode(department01.getDepartmentCode());

        }
        if(Objects.nonNull(department01.getDepartmentBranch()) && !"".equalsIgnoreCase(department01.getDepartmentBranch())){
            deDB.setDepartmentBranch(department01.getDepartmentBranch());

        }
        return departmentRepository.save(deDB);

    }

    @Override
    public Department01 getDetailsByName(String departmentName) {
        return departmentRepository.findByDepartmentName(departmentName);
    }


}
