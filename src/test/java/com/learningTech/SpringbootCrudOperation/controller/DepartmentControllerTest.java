package com.learningTech.SpringbootCrudOperation.controller;

import com.learningTech.SpringbootCrudOperation.entity.Department01;
import com.learningTech.SpringbootCrudOperation.error.Department01NotFoundException;
import com.learningTech.SpringbootCrudOperation.service.DepartmentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(DepartmentController.class)
class DepartmentControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private DepartmentService departmentService;

    private Department01 department01;
    @BeforeEach
    void setUp() {
        department01 = Department01.builder()
                .departmentId(1L)
                .departmentName("IT-05")
                .departmentBranch("hyderabad")
                .departmentLocation("dlf")
                .departmentCode("123")
                .build();


    }

    @Test
    void saveDepartment() throws Exception {
        Department01 inputDepartment = Department01.builder()
                .departmentName("Non IT")
                .departmentBranch("Civil")
                .departmentLocation("pune")
                .departmentCode("Civil-123")
                .build();
        Mockito.when(departmentService.saveDepartment(inputDepartment)).thenReturn(department01);
        mockMvc.perform(post("/lakshmi")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\n" +
                        "       \"departmentName\": \"Non IT\",\n" +
                        "        \"departmentBranch\": \"Civil\",\n" +
                        "        \"departmentCode\": \"Civil-123\",\n" +
                        "        \"departmentLocation\": \"pune\"\n" +
                        "}")

        )
                .andExpect(status().isOk());

    }

    @Test
    void getDepartmentByID() throws Exception {
        Mockito.when(departmentService.getDepartmentById(1L)).thenReturn(department01);

        mockMvc.perform(get("/lakshmi")
                .contentType(MediaType.APPLICATION_JSON)
        )
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.departmentName").value(department01.getDepartmentName()));
    }
}