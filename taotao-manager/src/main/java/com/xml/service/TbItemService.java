package com.xml.service;

import com.xml.bean.TbItem;

public interface TbItemService {
	/**
	 * 根据商品id查询商品信息
	 * @param tbItemId 商品id
	 * @return 返回指定商品id的商品信息
	 */
	TbItem findTbItemById(Long tbItemId);
}
