package com.aowin.service;

import java.util.List;

import com.aowin.model.StaPile;

public interface StaPileService {
	//查询的一个站点的方法
	public List<StaPile> selectId(int id);
}
