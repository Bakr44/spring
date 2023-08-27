package com.example.week6.Repository;

import com.example.week6.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends JpaRepository<User,Integer> {

User findUserByUsername(String username);
}
