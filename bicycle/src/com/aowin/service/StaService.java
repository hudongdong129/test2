package com.aowin.service;

import java.util.List;
import java.util.Map;

import com.aowin.model.Pile;
import com.aowin.model.Station;

public interface StaService {
	//进行增加站点的操作
	public int addStation(Station station,List<Pile> al);
	//只进行站点的添加
	public int addStation2(Station station);
	
	//查看站点的操作
	public List<Station> selectStation();
	
	//进行站点的更新操作
	public int updateStation(Station station,List<Pile> al);
	
	//进行模糊查询
	public List<Station> selectStation2(Station station);
	
	//能否进行删除站点
	public int deleteStation(int station_id);
	
	//进行分类查询
	public int selectNum();
	public List<Station> selectall(Map map);
}
