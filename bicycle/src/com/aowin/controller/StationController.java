package com.aowin.controller;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;
import com.aowin.model.GoodsPage;
import com.aowin.model.Pile;
import com.aowin.model.Station;
import com.aowin.service.StaService;

@Controller
public class StationController {
	@Resource
	private StaService StaService;

	
	//��������վ��ͳ�׮�Ĳ���
	/**
	 * @param station
	 * @return
	 */
	@RequestMapping("addStation.do")
	public ModelAndView addStation(Station station){
		ModelAndView mv = new ModelAndView();
		List<Pile> al = station.getAlp();
		if(al.size()==0){
			StaService.addStation2(station);
		}else{
			StaService.addStation(station,al);
		}
		
		mv.setViewName("success.jsp");
		return mv;
		
	}
	
/*	//�鿴ȫ��վ��
	@RequestMapping("checkStation.do")
	public ModelAndView selectStation(){
		ModelAndView mv = new ModelAndView();
		List<Station> lts = StaService.selectStation();
		mv.addObject("lts", lts);
		mv.setViewName("right.jsp");
		return mv;
	}*/
	//����ģ����ѯվ��
	@RequestMapping("checkLike.do")
	@ResponseBody
	public String selectLike(Station station){
		ModelAndView mv = new ModelAndView();
		
		System.out.println(station.getStation_code());
		
		List<Station> al = StaService.selectStation2(station);
		String als = JSONArray.toJSONString(al);
		
		System.out.println(al);
		
		return als;
		
	}
	
	//����վ��ĸ���
	@RequestMapping("updateAll.do")
	public ModelAndView updateAll(Station station){
		ModelAndView mv = new ModelAndView();
		List<Pile> al = station.getAlp();
		StaService.updateStation(station, al);
		mv.setViewName("checkStation.do");
		return mv;
	}
	//ɾ��վ��
	@RequestMapping("selectStation.do")
	public ModelAndView deleteStation(int station_id,HttpServletRequest request){
		ModelAndView mv = new ModelAndView();
		int count = StaService.deleteStation(station_id);
		System.out.println(count);
		String message ="";
		if(count==0){
			//request.getSession().setAttribute("message", "ע���ɹ�");
			message = "ע���ɹ�";
		}else{
			//request.getSession().setAttribute("message", "��׮�г��޷�ɾ��");
			message = "��׮�г��޷�ɾ��";
		}
		mv.addObject("message", message);
		mv.setViewName("checkStation.do");	
		return mv;
	}
	
	//��ҳ�Ĳ�ѯ
	@RequestMapping("checkStation.do")
	public ModelAndView selectAll(Integer nowPage){
		ModelAndView mv = new ModelAndView();
		System.out.println(nowPage);
		if(nowPage==null){
			nowPage=1;
		}
		Map map = new HashMap();
		map.put("nowPage", nowPage);
		map.put("pageSize", 3);
		int a = StaService.selectNum();
		System.out.println(a);
		
		List<Station> al = StaService.selectall(map);
		int b = 0;
		if(a%3==0){
			b =a/3;
		}else{
			b =a/3+1;
		}
		GoodsPage page = new GoodsPage(nowPage,3,b,al);
		mv.addObject("page", page);
		mv.addObject("al", al);
		mv.setViewName("right.jsp");
		return mv;
	}
	

	


	public StaService getStaService() {
		return StaService;
	}


	public void setStaService(StaService staService) {
		StaService = staService;
	}
	


	
	
}
