package com.vudang.department.config;

import com.vudang.department.entity.Department;
import com.vudang.department.repository.DepartmentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DepartmentConfig {
    @Bean
    CommandLineRunner departmentCommandLineRunner(DepartmentRepository departmentRepository) {
        return args -> {
            departmentRepository.saveAll(
                    List.of(
                            new Department(
                                    1L,
                                    "Engineer",
                                    "Saigon Centre",
                                    "EN"
                            ),
                            new Department(
                                    2L,
                                    "Designer",
                                    "Saigon Centre",
                                    "DE"
                            ),
                            new Department(
                                    3L,
                                    "Human Resource",
                                    "Saigon Centre",
                                    "HR"
                            )
                    )
            );
        };
    }
}
