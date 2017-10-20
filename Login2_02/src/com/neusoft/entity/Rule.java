package com.neusoft.entity;

public class Rule {
/*	-- ����
	create table rule(
	id      int      primary key auto_increment,
	pid     int,-- ��Ʒid,������Ʒ���id
	size   varchar(20)   -- �ߴ�
	);*/
	
	private int id;
	private int pid;
	private String size;
	public Rule() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Rule [id=" + id + ", pid=" + pid + ", size=" + size + "]";
	}
	public Rule(int id, int pid, String size) {
		super();
		this.id = id;
		this.pid = pid;
		this.size = size;
	}
	public Rule(int pid, String size) {
		super();
		this.pid = pid;
		this.size = size;
	}

}
