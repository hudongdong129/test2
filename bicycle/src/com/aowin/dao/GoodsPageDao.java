package com.aowin.dao;

import java.util.List;
import java.util.Map;

import com.aowin.model.Station;

public interface GoodsPageDao {
	//��ѯ�ܵ�����
	public int selectNum();
	
	//��ҳ��ѯ
	public List<Station> selectall(Map map);
}
