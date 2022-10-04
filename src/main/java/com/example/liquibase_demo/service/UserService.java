package com.example.liquibase_demo.service;

import com.example.liquibase_demo.entity.User;

/**
 * UserService interface
 *
 * @author jbojovic
 * @version 1.0
 * @since 1.0
 */
public interface UserService {

    String login(String username, String password);

}
