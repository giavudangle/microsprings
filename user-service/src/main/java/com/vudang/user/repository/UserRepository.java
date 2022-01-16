package com.vudang.user.repository;

import com.vudang.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User,Long> {
    @Query("SELECT u FROM users u WHERE u.id = ?1")
    User findByUserId(Long userId);
}
