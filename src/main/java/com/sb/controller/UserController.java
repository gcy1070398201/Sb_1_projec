package com.sb.controller;

import com.sb.bean.User;
import com.sb.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserMapper mapper;

    @GetMapping(value = "/findId/{id}")
    public User findInfoId(@PathVariable Integer id){

        return mapper.findIdInfo(id);
    }

    @RequestMapping(value = "/addinfo")
    public String  addInfo(@RequestParam String name,
                           @RequestParam String upsd){
        User user=new User();
        user.setUname(name);
        user.setUpsd(upsd);
        int tyoe=mapper.addInfo(user);
        if (tyoe==1){
            return "新增成功！";
        }else{
            return "新增失败！";
        }
    }
    @RequestMapping(value = "/allSelect")
    public List<User> allSelect(){
        List<User> list=new ArrayList<>();
        list=mapper.allSelect();
        return list;
    }
}
