package com.vudang.department.controller;


import com.vudang.department.entity.Department;
import com.vudang.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping
    public Department saveDepartment(@RequestBody Department department) {
        log.info("[LOG] Inside saveDepartment of the Department Controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long id) {
        log.info("[LOG] Inside findDepartmentById of the Department Controller");
        return departmentService.findDepartmentById(id);
    }

}
