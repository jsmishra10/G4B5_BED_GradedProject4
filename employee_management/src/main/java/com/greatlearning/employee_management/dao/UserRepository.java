package com.greatlearning.employee_management.dao;

import com.greatlearning.employee_management.entity.Role;
import com.greatlearning.employee_management.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByName(String username);
}
