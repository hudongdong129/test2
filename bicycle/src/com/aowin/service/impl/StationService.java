package com.aowin.service.impl;

import java.util.List;
import java.util.Map;

import com.aowin.dao.PileDao;
import com.aowin.dao.StationDao;
import com.aowin.model.Pile;
import com.aowin.model.Station;
import com.aowin.service.StaService;

public class StationService implements StaService{
	
	private StationDao stationDao;
	private PileDao pileDao;

	public int addStation(Station station,List<Pile> al) {
		int a1 = stationDao.addStation(station);
		for(Pile pl:al){
			int a2 = pileDao.addPile(pl);
		}
		return a1;
	}
	
	@Override
	public List<Station> selectStation() {
		List<Station> lts = stationDao.selectStation();
		return lts;
	}
	
	@Override
	public int updateStation(Station station, List<Pile> al) {
		int a1 = stationDao.updataStaton(station);
		int a2 = pileDao.updatePile(al);
		return a1+a2;
	}
	
	
	@Override
	public List<Station> selectStation2(Station station) {
		List<Station> al = stationDao.selectStation2(station);
		return al;
	}

	@Override
	public int deleteStation(int station_id) {
		 Pile count = pileDao.selectPile(station_id);
		if(count.getCount()==0){
			int a = stationDao.deleteStation(station_id);
			int b = pileDao.deletePile(station_id);
		}
		return count.getCount();
	}
	
	@Override
	public int selectNum() {
		Station a = stationDao.selectNum();
		
		return a.getCount();
	}

	@Override
	public List<Station> selectall(Map map) {
		
		List<Station> al = stationDao.selectall(map);
		return al;
	}
	
	@Override
	//÷ªÃÌº”’æµ„
	public int addStation2(Station station) {
		int a = stationDao.addStation(station);
		return a;
	}
	

	public StationDao getStationDao() {
		return stationDao;
	}

	public void setStationDao(StationDao stationDao) {
		this.stationDao = stationDao;
	}

	public PileDao getPileDao() {
		return pileDao;
	}

	public void setPileDao(PileDao pileDao) {
		this.pileDao = pileDao;
	}

	
	
	

	

	



	



	
	
	

}
