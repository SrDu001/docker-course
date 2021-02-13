/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.testdocker;

import com.example.entity.User;
import com.example.dao.IUserDAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author dpiraban
 */
@RestController
@RequestMapping("/api/")
public class HelloWorldController {

    @Autowired
    private IUserDAO userDAO;

    @GetMapping(value = "/hello")
    public List<User> getMessage() {
        return userDAO.findAll();
    }
}
