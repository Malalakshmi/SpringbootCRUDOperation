package com.learningTech.SpringbootCrudOperation;

import com.learningTech.SpringbootCrudOperation.entity.Department01;
import com.learningTech.SpringbootCrudOperation.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootCrudOperationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCrudOperationApplication.class, args);
	}

	@Autowired
	private DepartmentRepository departmentRepository;
	@Override
	public void run(String... args) throws Exception {
		Department01 dd = new Department01();
		dd.setDepartmentName("medical");
		dd.setDepartmentCode("med-123");
		dd.setDepartmentBranch("ECE");
		dd.setDepartmentLocation("chennai");
		departmentRepository.save(dd);

		Department01 dd1 = new Department01();
		dd1.setDepartmentName("IT");
		dd1.setDepartmentCode("IT-123");
		dd1.setDepartmentBranch("CSC");
		dd1.setDepartmentLocation("Hyderabad");
		departmentRepository.save(dd1);

	}
}
