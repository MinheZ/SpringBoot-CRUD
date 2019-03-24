package com.minhe.controller.admin;

import com.minhe.entity.User;
import com.minhe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    @RequestMapping("/findById")
    public User findById(@RequestParam("id") Long id) {
        return userService.findById(id);
    }

    // 从浏览器接收一个Jason对象，并传入后台
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    @ResponseBody
    public void create(User user) {
        userService.create(user);
    }

    @RequestMapping("/delete")
    public void delete(@RequestParam("id") Long id) {
        userService.delete(id);
    }

}
