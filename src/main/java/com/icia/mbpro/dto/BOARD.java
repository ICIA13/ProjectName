package com.icia.mbpro.dto;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

public class BOARD {

	private int boNum;
	private String boWriter;
	private String boTitle;
	private String boContent;
	private Date boDate;
	private int boHit;
	
	private MultipartFile boFile;
	private String boFileName;
	
	public int getBoNum() {
		return boNum;
	}
	public void setBoNum(int boNum) {
		this.boNum = boNum;
	}
	public String getBoWriter() {
		return boWriter;
	}
	public void setBoWriter(String boWriter) {
		this.boWriter = boWriter;
	}
	public String getBoTitle() {
		return boTitle;
	}
	public void setBoTitle(String boTitle) {
		this.boTitle = boTitle;
	}
	public String getBoContent() {
		return boContent;
	}
	public void setBoContent(String boContent) {
		this.boContent = boContent;
	}
	public Date getBoDate() {
		return boDate;
	}
	public void setBoDate(Date boDate) {
		this.boDate = boDate;
	}
	public int getBoHit() {
		return boHit;
	}
	public void setBoHit(int boHit) {
		this.boHit = boHit;
	}
	public MultipartFile getBoFile() {
		return boFile;
	}
	public void setBoFile(MultipartFile boFile) {
		this.boFile = boFile;
	}
	public String getBoFileName() {
		return boFileName;
	}
	public void setBoFileName(String boFileName) {
		this.boFileName = boFileName;
	}
	
	@Override
	public String toString() {
		return "BOARD [boNum=" + boNum + ", boWriter=" + boWriter + ", boTitle=" + boTitle + ", boContent=" + boContent
				+ ", boDate=" + boDate + ", boHit=" + boHit + ", boFile=" + boFile + ", boFileName=" + boFileName + "]";
	}
	
	
}
