package com.vudang.user.config;

import com.vudang.user.entity.User;
import com.vudang.user.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {
    @Bean
    CommandLineRunner userCommandLineRunner(UserRepository userRepository){
        return args -> {
            userRepository.saveAll(
                    List.of(
                            new User(1L,"Gia Vu","Dang Le","vudang@lazada.com",1L),
                            new User(2L,"Dang","Daniel","danieldang@lazada.com",2L)
                            )
            );
        };
    }
}




