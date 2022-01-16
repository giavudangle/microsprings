package com.vudang.department.repository;

import com.vudang.department.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

    @Query("SELECT d FROM departments d WHERE d.id = ?1")
    public Department findByDepartmentId(Long id);
}

