package com.aowin.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;
import com.aowin.model.StaPile;
import com.aowin.service.StaPileService;

@Controller
public class StaPileController {
	@Resource
	private StaPileService staPileService;
	
	//查看站点和站点对应的车桩信息
	@RequestMapping("checkId.do")
	public ModelAndView selectId(int station_id){
		ModelAndView mv = new ModelAndView();
		System.out.println(station_id);
		List<StaPile> lsp = staPileService.selectId(station_id);
		System.out.println(lsp);
		mv.addObject("lsp",lsp);
		mv.setViewName("Idview.jsp");
		return mv;	
	}
	//查看站点和站点对应的车桩信息 通过ajax
	@RequestMapping("checkId2.do")
	@ResponseBody
	public String selectId2(int station_id){
		System.out.println(station_id);
		List<StaPile> lsp = staPileService.selectId(station_id);
		System.out.println(lsp);
		String lt = JSONArray.toJSONString(lsp);
		return lt;	
	}

	public StaPileService getStaPileService() {
		return staPileService;
	}

	public void setStaPileService(StaPileService staPileService) {
		this.staPileService = staPileService;
	}
	
	
	
	
}
