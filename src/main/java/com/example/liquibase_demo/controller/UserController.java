package com.example.liquibase_demo.controller;

import com.example.liquibase_demo.dto.UserLoginDTO;
import com.example.liquibase_demo.service.ItemService;
import com.example.liquibase_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jbojovic
 * @version 1.0
 * @since 1.0
 */
@Controller
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ItemService itemService;

    /**
     *
     * GET method
     *
     * @return index.html
     */
    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    /**
     *
     * Method used to perform login into system with passed atributes
     *
     * @param user - user data from form
     * @param model - model object for adding items on page
     * @return index.html on unsuccessful login, panel.html on successful login
     */
    @PostMapping("/")
    public String doLogin(@ModelAttribute UserLoginDTO user, Model model) {
        String page = userService.login(user.getUsername(), user.getPassword());
        if(page.equals("panel")) {
            model.addAttribute("items", itemService.findAll());
        }
        return page;
    }

}
