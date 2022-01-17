package com.vudang.cloud.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/user-service-fallback")
    public String userServiceFallback(){
        return "UserService is talking longer than expected. " + "Please try again!";
    }

    @GetMapping("/department-service-fallback")
    public String departmentServiceFallback(){
        return "DepartmentService is talking longer than expected. " + "Please try again!";
    }
}
