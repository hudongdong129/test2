package com.aowin.dao;

import java.util.List;

import com.aowin.model.StaPile;

public interface StaPileDao {
	//进行联合查询
	public List<StaPile> selectId(int id);
}
