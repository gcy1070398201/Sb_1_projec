package com.sb.controller;

import com.sb.bean.User;
import com.sb.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserMapper mapper;

    @GetMapping(value = "/findId/{id}")
    public User findInfoId(@PathVariable Integer id){

        return mapper.findIdInfo(id);
    }
}
