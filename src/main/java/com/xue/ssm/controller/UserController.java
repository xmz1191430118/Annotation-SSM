package com.xue.ssm.controller;

import com.xue.ssm.pojo.User;
import com.xue.ssm.service.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author xmz
 * @date 2022/6/25 16:42
 */
@Controller
public class UserController {
    @Autowired
    UserServiceImpl userServiceImpl;

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/getAllUser",method = RequestMethod.GET)
    @ResponseBody
    public List<User> getAllUser(){
        List<User> userList = userServiceImpl.getAllUser();
        System.out.println(userList);
        return userList;
    }


    @RequestMapping(value = "/getUserById",method = RequestMethod.GET)
    @ResponseBody
    public User getUserById(@RequestParam("id") Integer id){
        User user = userServiceImpl.getUserById(id);
        System.out.println(user);
        return user;
    }

}
