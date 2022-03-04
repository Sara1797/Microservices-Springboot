package com.sarishti.user.repository;

import com.sarishti.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUserId(Long userId);
}
