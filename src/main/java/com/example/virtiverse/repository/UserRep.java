package com.example.virtiverse.repository;

import com.example.virtiverse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRep extends JpaRepository<User, String> {
    User findByUserName(String userName);
}
