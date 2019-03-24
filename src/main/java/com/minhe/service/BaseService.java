package com.minhe.service;

import java.util.List;

public interface BaseService<T> {
    // 查询所有
    List<T> findAll();
    // 根据Id查询
    T findById(Long id);
    // 添加
    void create(T t);
    // 批量删除
    void delete(Long id);
    // 修改
    void update(T t);
}
