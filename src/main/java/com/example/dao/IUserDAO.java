package com.example.dao;


import com.example.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IUserDAO extends JpaRepository<User, Integer> {

}
