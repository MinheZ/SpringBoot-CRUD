package com.minhe.service.impl;

import com.minhe.entity.Goods;
import com.minhe.entity.PageBean;
import com.minhe.mapper.GoodsMapper;
import com.minhe.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> findAll() {
        return goodsMapper.findAll();
    }

    @Override
    public Goods findById(Long id) {
        return goodsMapper.findById(id);
    }

    @Override
    public void create(Goods goods) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Goods goods) {

    }

    @Override
    public PageBean findByPage(Goods goods, int pageCode, int pageSIze) {
        return null;
    }
}
