package com.minhe.service.impl;

import com.minhe.entity.User;
import com.minhe.mapper.UserMapper;
import com.minhe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public User findById(Long id) {
        return userMapper.findById(id);
    }

    @Override
    public void create(User user) {
        userMapper.create(user);
    }

    @Override
    public void delete(Long... ids) {
        for (Long id : ids)
            userMapper.delete(id);
    }

    @Override
    public void update(User user) {

    }

    @Override
    public User findByName(String name) {
        return userMapper.findByName(name);
    }
}
