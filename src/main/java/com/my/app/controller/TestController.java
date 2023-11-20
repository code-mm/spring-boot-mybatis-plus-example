package com.my.app.controller;


import com.my.app.mysql.my_app.entity.MUser;
import com.my.app.mysql.my_app.service.IMUserService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Resource
    private IMUserService userService;
    @GetMapping(value = "/users")
    public List<MUser> getUsers() {
        List<MUser> list = userService.list();
        return list;
    }
}
