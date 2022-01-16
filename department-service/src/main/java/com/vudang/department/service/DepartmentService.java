package com.vudang.department.service;

import com.vudang.department.entity.Department;
import com.vudang.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("[LOG] Inside saveDepartment of the Department Service");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long id) {
        log.info("[LOG] Inside findDepartmentById of the Department Service");
        return departmentRepository.findByDepartmentId(id);
    }
}
