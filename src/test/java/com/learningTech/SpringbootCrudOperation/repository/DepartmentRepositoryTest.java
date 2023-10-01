package com.learningTech.SpringbootCrudOperation.repository;

import com.learningTech.SpringbootCrudOperation.entity.Department01;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.jdbc.DataJdbcTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class DepartmentRepositoryTest {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private TestEntityManager entityManager;

    @BeforeEach
    void setUp() {
        Department01 department01 =
                Department01.builder()
                        .departmentName("Mechanical Engineering")
                        .departmentCode("ME - 011")
                        .departmentBranch("Delhi")
                        .departmentLocation("hyd")
                        .build();

        entityManager.persist(department01);
    }

    @Test
    public void whenFindById_thenReturnDepartment() {
        Department01 department01 = departmentRepository.findById(1L).get();
        assertEquals(department01.getDepartmentName(), "Mechanical Engineering");
    }
}
