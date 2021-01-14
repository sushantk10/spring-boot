package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customers {
	
	@Id
	private int cid;
	private String cemail;
	private String cname;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	@Override
	public String toString() {
		return "Customers [cid=" + cid + ", cemail=" + cemail + ", cname=" + cname + "]";
	}
	

	
}
