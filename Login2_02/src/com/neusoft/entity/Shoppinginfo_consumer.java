package com.neusoft.entity;

public class Shoppinginfo_consumer {
   /*-- 买家购买信息
	create table  shoppinginfo_consumer(
	id       int      primary  key auto_increment,
	aid      int   ,-- 买家账号id,依赖acount_consumer表中的id
	nickname  varchar(20),-- 用户昵称
	money  double,-- 订单金额
	lasttime bigint  -- 最近消费
	);*/
	
	private int id;
	public Shoppinginfo_consumer(int aid) {
		super();
		this.aid = aid;
	}
	private int aid;
	private String nickname;
	private  double money;
	private  long lasttime;
	public Shoppinginfo_consumer() {
		super();
	}
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Shoppinginfo_consumer [id=" + id + ", aid=" + aid + ", nickname=" + nickname + ", money=" + money
				+ ", lasttime=" + lasttime + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public long getLasttime() {
		return lasttime;
	}
	public void setLasttime(long lasttime) {
		this.lasttime = lasttime;
	}
	
	public Shoppinginfo_consumer(int id, int aid, String nickname, double money, long lasttime) {
		super();
		this.id = id;
		this.aid = aid;
		this.nickname = nickname;
		this.money = money;
		this.lasttime = lasttime;
	}
	public Shoppinginfo_consumer(int aid, String nickname, double money, long lasttime) {
		super();
		this.aid = aid;
		this.nickname = nickname;
		this.money = money;
		this.lasttime = lasttime;
	}
	public Shoppinginfo_consumer(int aid, String nickname) {
		super();
		this.aid = aid;
		this.nickname = nickname;
	}
	public Shoppinginfo_consumer(int aid, long lasttime) {
		super();
		this.aid = aid;
		this.lasttime = lasttime;
	}

	
	

}
