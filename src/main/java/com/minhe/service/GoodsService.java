package com.minhe.service;

import com.minhe.entity.Goods;
import com.minhe.entity.PageBean;

public interface GoodsService extends BaseService<Goods>{

    PageBean findByPage(Goods goods, int pageCode, int pageSIze);

}
