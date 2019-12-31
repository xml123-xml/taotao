package com.xml.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xml.bean.TbItem;
import com.xml.mapper.TbItemMapper;
import com.xml.service.TbItemService;
@Service
public class TbItemServiceImpl implements TbItemService {
	@Autowired
	private TbItemMapper tbItemMapper;
	public TbItem findTbItemById(Long tbItemId) {
		TbItem tbItem= tbItemMapper.findTbItemById(tbItemId);
		return tbItem;
	}

}
