package com.aowin.service.impl;

import java.util.List;

import com.aowin.dao.StaPileDao;
import com.aowin.model.StaPile;
import com.aowin.service.StaPileService;

public class StaPService implements StaPileService{
	
	private StaPileDao staPileDao;
	
	public List<StaPile> selectId(int id) {
		List<StaPile> lsp = staPileDao.selectId(id);
		return lsp;
	}
	
	
	public StaPileDao getStaPileDao() {
		return staPileDao;
	}
	public void setStaPileDao(StaPileDao staPileDao) {
		this.staPileDao = staPileDao;
	}
	
	

}
