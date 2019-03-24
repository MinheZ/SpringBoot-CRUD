package com.minhe.mapper;

import com.minhe.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> findAll();

    User findById(Long id);

    void create(User user);

    void delete(Long id);

    User findByName(String name);
}
