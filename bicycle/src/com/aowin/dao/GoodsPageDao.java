package com.aowin.dao;

import java.util.List;
import java.util.Map;

import com.aowin.model.Station;

public interface GoodsPageDao {
	//查询总的条数
	public int selectNum();
	
	//分页查询
	public List<Station> selectall(Map map);
}
