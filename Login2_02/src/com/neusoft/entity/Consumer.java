package com.neusoft.entity;

import java.util.List;
import java.io.*;
/*
 * ��Ա����Ϣ��
 */
public class Consumer implements  Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	public Consumer() {
		super();
	}

	private  int id;
	private  String loginname;
	private String password;
	private   long  registertime;//-- ע��ʱ��
	private long lastlogintime;// ����¼ʱ��
	private String ip;//ip��ַ
	public Consumer(int id,String loginname) {
		super();
		this.id=id;
		this.loginname = loginname;
	}
	public Consumer(int id,String loginname, String password) {
		super();
		this.id=id;
		this.loginname = loginname;
		this.password = password;
	}
	public Consumer(int id, String loginname, String password, String ip) {
		super();
		this.id = id;
		this.loginname = loginname;
		this.password = password;
		this.ip = ip;
	}
	public Consumer(String loginname, String password, String ip) {
		super();
		this.loginname = loginname;
		this.password = password;
		this.ip = ip;
	}
	public Consumer(String loginname, String password) {
		super();
		this.loginname = loginname;
		this.password = password;
	}
	public Consumer(int id, String loginname, String password, long registertime, long lastlogintime, String ip) {
		super();
		this.id = id;
		this.loginname = loginname;
		this.password = password;
		this.registertime = registertime;
		this.lastlogintime = lastlogintime;
		this.ip = ip;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getRegistertime() {
		return registertime;
	}
	public void setRegistertime(long registertime) {
		this.registertime = registertime;
	}
	public long getLastlogintime() {
		return lastlogintime;
	}
	public void setLastlogintime(long lastlogintime) {
		this.lastlogintime = lastlogintime;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	@Override
	public String toString() {
		return "Consumer [id=" + id + ", loginname=" + loginname + ", password=" + password + ", registertime="
				+ registertime + ", lastlogintime=" + lastlogintime + ", ip=" + ip + "]";
	}
	
	public Consumer(String loginname, String password, long registertime, long lastlogintime, String ip) {
		super();
		this.loginname = loginname;
		this.password = password;
		this.registertime = registertime;
		this.lastlogintime = lastlogintime;
		this.ip = ip;
	}
	
	
	
}