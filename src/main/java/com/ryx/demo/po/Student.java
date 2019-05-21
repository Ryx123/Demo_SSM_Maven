package com.ryx.demo.po;

import java.util.Date;

public class Student {
	private int sid;
	private String sname;
	private String adress;
	private String username;
	private String password;
	private String createtime;
	private String updatetime;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sid, String sname, String adress, String username, String password, String createtime,
			String updatetime) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.adress = adress;
		this.username = username;
		this.password = password;
		this.createtime = createtime;
		this.updatetime = updatetime;
	}

	
	public Student(String sname, String adress, String createtime) {
		super();
		this.sname = sname;
		this.adress = adress;
		this.createtime = createtime;
	}

	public Student(int sid, String sname, String adress, String updatetime) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.adress = adress;
		this.updatetime = updatetime;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCreatetime() {
		return createtime;
	}

	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

	public String getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", adress=" + adress + ", username=" + username
				+ ", password=" + password + ", createtime=" + createtime + ", updatetime=" + updatetime + "]";
	}
	
	
	
	
}
