package com.aowin.dao;

import java.util.List;
import java.util.Map;

import com.aowin.model.Station;

public interface StationDao {
	//����վ������
	public int addStation(Station station);
	//�鿴ȫ��վ��
	public List<Station> selectStation();
	
	//�����޸�
	public int updataStaton(Station station);
	
	//����ģ����ѯ
	public List<Station> selectStation2(Station station);
	
	//����ɾ��վ��
	public int deleteStation(int stataion_id);
	
	//���з�ҳ��ѯ
	public Station selectNum();
	public List<Station> selectall(Map map);
	

}
