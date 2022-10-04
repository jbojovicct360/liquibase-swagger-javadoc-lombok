package com.example.liquibase_demo.service;

import com.example.liquibase_demo.entity.User;
import com.example.liquibase_demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implementation of ItemService methods
 *
 * @author jbojovic
 * @version 1.0
 * @since 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    /**
     * @param username - string parameter for username
     * @param password - string parameter for password
     * @return String value of page that needs to be opened
     */
    @Override
    public String login(String username, String password) {
        User user = repository.findByUsernameAndPassword(username, password);
        if(user == null)
            return "index";
        return "panel";
    }
}
