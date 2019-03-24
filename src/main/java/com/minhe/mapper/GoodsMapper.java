package com.minhe.mapper;

import com.github.pagehelper.Page;
import com.minhe.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoodsMapper {

    List<Goods> findAll();

    Goods findById(Long id);

    void create(Goods user);

    void delete(Long id);

    Page<Goods> findByPage(Goods goods);

    void update(Goods goods);
}
