package com.aowin.dao;

import java.util.List;

import com.aowin.model.Pile;

public interface PileDao {
	//进行车桩的添加
	public int addPile(Pile pile);
	
	//进行修改
	public int updatePile(List<Pile> ls);
	
	//判断车桩上是否有自行车
	public Pile selectPile(int station_id);
	
	//删除车桩信息
	public int deletePile(int station_id);
	
}
