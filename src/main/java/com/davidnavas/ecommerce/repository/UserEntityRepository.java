package com.davidnavas.ecommerce.repository;

import com.davidnavas.ecommerce.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserEntityRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByUserName(String username);
}