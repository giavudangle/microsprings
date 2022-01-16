package com.vudang.user.service;

import com.vudang.user.entity.User;
import com.vudang.user.repository.UserRepository;
import com.vudang.user.shared.entity.ResponseTemplate;
import com.vudang.user.shared.entity.SharedDepartment;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping
    public User saveUser(User user) {
        log.info("Inside saveUser of UserService");
        return this.userRepository.save(user);
    }

    public ResponseTemplate getUserWithDepartment(Long userId) {
        log.info("Inside getUserWithDepartment of UserService");
        ResponseTemplate responseTemplate = new ResponseTemplate();
        User user = userRepository.findByUserId(userId);
        SharedDepartment department = restTemplate.getForObject(
                "http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(),
                SharedDepartment.class);
        responseTemplate.setUser(user);
        responseTemplate.setDepartment(department);
        return responseTemplate;
    }
}
