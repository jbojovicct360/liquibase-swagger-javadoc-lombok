package com.example.liquibase_demo.service;

import com.example.liquibase_demo.entity.Item;
import com.example.liquibase_demo.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 * Implementation of ItemService methods
 *
 * @author jbojovic
 * @version 1.0
 * @since 1.0
 */
@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private ItemRepository repository;

    /**
     * @return List of all items in database
     */
    @Override
    public List<Item> findAll() {
        return repository.findAll();
    }

    /**
     * @param id int parameter of Item entity
     * @return item description if item is present or null if item is not present
     */
    @Override
    public String findById(int id) {
        Optional<Item> optional = repository.findById(id);
        if(optional.isPresent()) {
            return optional.get().getDescription();
        }
        return null;
    }
}
