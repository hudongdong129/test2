package com.aowin.service;

import java.util.List;
import java.util.Map;

import com.aowin.model.Pile;
import com.aowin.model.Station;

public interface StaService {
	//��������վ��Ĳ���
	public int addStation(Station station,List<Pile> al);
	//ֻ����վ������
	public int addStation2(Station station);
	
	//�鿴վ��Ĳ���
	public List<Station> selectStation();
	
	//����վ��ĸ��²���
	public int updateStation(Station station,List<Pile> al);
	
	//����ģ����ѯ
	public List<Station> selectStation2(Station station);
	
	//�ܷ����ɾ��վ��
	public int deleteStation(int station_id);
	
	//���з����ѯ
	public int selectNum();
	public List<Station> selectall(Map map);
}
