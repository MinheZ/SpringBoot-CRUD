package com.minhe.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
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
    public void delete(Long... ids) {
        for (Long id : ids)
            goodsMapper.delete(id);
    }

    @Override
    public void update(Goods goods) {
        goodsMapper.update(goods);
    }

    @Override
    public PageBean findByPage(Goods goods, int pageCode, int pageSIze) {
        // 使用 MyBatis 分页插件
        PageHelper.startPage(pageCode, pageSIze);
        Page<Goods> page = goodsMapper.findByPage(goods);

        return new PageBean(page.getTotal(), page.getResult());
    }
}
