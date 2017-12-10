package com.aowin.model;

import java.util.ArrayList;
import java.util.List;

public class GoodsPage {
	//当前页
	private Integer nowPage;
	//每页显示条数
	private int pageSize;
	//总页数
	private int totalPage;
	//当前页的数据
	private List<Station> data;
	
	public GoodsPage(Integer nowPage,int pageSize,int totalPage,List<Station> data){
		this.nowPage = nowPage;
		this.pageSize = pageSize;
		this.totalPage = totalPage;
		this.data = data;
	} 
	
	//总的条数
	private int count;



	public Integer getNowPage() {
		return nowPage;
	}

	public void setNowPage(Integer nowPage) {
		this.nowPage = nowPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<Station> getData() {
		return data;
	}

	public void setData(List<Station> data) {
		this.data = data;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	

	
	
	
	
}
