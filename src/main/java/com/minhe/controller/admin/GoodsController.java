package com.minhe.controller.admin;

import com.minhe.entity.Goods;
import com.minhe.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("/findById")
    public Goods findById(@RequestParam(value = "id", required = false) Long id) {
        return goodsService.findById(id);
    }

    @RequestMapping("/findAll")
    public List<Goods> findAll() {
        return goodsService.findAll();
    }

}
