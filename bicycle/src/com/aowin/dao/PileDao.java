package com.aowin.dao;

import java.util.List;

import com.aowin.model.Pile;

public interface PileDao {
	//���г�׮�����
	public int addPile(Pile pile);
	
	//�����޸�
	public int updatePile(List<Pile> ls);
	
	//�жϳ�׮���Ƿ������г�
	public Pile selectPile(int station_id);
	
	//ɾ����׮��Ϣ
	public int deletePile(int station_id);
	
}
