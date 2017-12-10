package com.aowin.model;

public class Pile {
	private int pile_id;
	private int vender_id;
	private String pile_code;
	private int station_id;
	private String status;
	private String install_time;
	private String disassembly_time;
	private int user_id;
	private String operator_time;
    private String bicycle_id;
    private String remark;
    
    //查询到的条数
    private int count;
    
    
    
	public int getPile_id() {
		return pile_id;
	}
	public void setPile_id(int pile_id) {
		this.pile_id = pile_id;
	}
	public int getVender_id() {
		return vender_id;
	}
	public void setVender_id(int vender_id) {
		this.vender_id = vender_id;
	}
	public String getPile_code() {
		return pile_code;
	}
	public void setPile_code(String pile_code) {
		this.pile_code = pile_code;
	}
	public int getStation_id() {
		return station_id;
	}
	public void setStation_id(int station_id) {
		this.station_id = station_id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getInstall_time() {
		return install_time;
	}
	public void setInstall_time(String install_time) {
		this.install_time = install_time;
	}
	public String getDisassembly_time() {
		return disassembly_time;
	}
	public void setDisassembly_time(String disassembly_time) {
		this.disassembly_time = disassembly_time;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getOperator_time() {
		return operator_time;
	}
	public void setOperator_time(String operator_time) {
		this.operator_time = operator_time;
	}
	public String getBicycle_id() {
		return bicycle_id;
	}
	public void setBicycle_id(String bicycle_id) {
		this.bicycle_id = bicycle_id;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	 
    
	  
}
