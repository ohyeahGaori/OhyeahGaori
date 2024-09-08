package com.example.HyegyeongGaori.global.oauth.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.HyegyeongGaori.global.oauth.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    
    Optional<User> findByEmail(String email); // 중복 가입 확인
}
