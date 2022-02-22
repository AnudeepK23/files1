package com.example.demo.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Alien {
	
	@Id
	private int aid;
	private String lang;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}

}
