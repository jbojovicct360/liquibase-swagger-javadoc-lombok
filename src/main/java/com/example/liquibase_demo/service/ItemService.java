package com.example.liquibase_demo.service;

import com.example.liquibase_demo.entity.Item;

import java.util.List;

/**
 *
 * ItemService interface
 *
 * @author jbojovic
 * @version 1.0
 * @since 1.0
 */
public interface ItemService {

    /**
     * @return List of all items in database
     */
    List<Item> findAll();

    String findById(int id);

}
