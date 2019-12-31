package com.xml.mapper;

import com.xml.bean.TbItem;

public interface TbItemMapper {
	/**
	 * 查询tbitem表根据商品id查询商品信息
	 * @param tbItemId
	 * @return
	 */
	TbItem findTbItemById(Long tbItemId);
	
}
