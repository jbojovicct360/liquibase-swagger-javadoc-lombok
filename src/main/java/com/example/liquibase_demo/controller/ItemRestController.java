package com.example.liquibase_demo.controller;

import com.example.liquibase_demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jbojovic
 * @version 1.0
 * @since 1.0
 */
@RestController
public class ItemRestController {

    @Autowired
    private ItemService service;

    /**
     * @param id id of item for which we need description
     * @return ResponseEntity object which contains description or message that item not found
     */
    @GetMapping("/item={id}")
    public ResponseEntity<String> getDescriptionById(@PathVariable("id") int id) {
        String description = service.findById(id);
        if(description == null)
            return new ResponseEntity<>("Item not found!", HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(description, HttpStatus.OK);
    }

}
