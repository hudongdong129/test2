package com.aowin.dao;

import java.util.List;
import java.util.Map;

import com.aowin.model.Station;

public interface StationDao {
	//进行站点的添加
	public int addStation(Station station);
	//查看全部站点
	public List<Station> selectStation();
	
	//进行修改
	public int updataStaton(Station station);
	
	//进行模糊查询
	public List<Station> selectStation2(Station station);
	
	//进行删除站点
	public int deleteStation(int stataion_id);
	
	//进行分页查询
	public Station selectNum();
	public List<Station> selectall(Map map);
	

}
