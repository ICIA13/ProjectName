package com.icia.mbpro.dto;


import org.springframework.web.multipart.MultipartFile;

public class MEMBER {
	
	// 필드 설정
	private String memId;
	private String memPw;
	private String memName;
	private String memBirth;
	private String memGender;
	private String memEmail;
	private String memPhone;
	private String memAddr;
	
	private MultipartFile memProfile;
	private String memProfileName;
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemPw() {
		return memPw;
	}
	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public String getMemBirth() {
		return memBirth;
	}
	public void setMemBirth(String memBirth) {
		this.memBirth = memBirth;
	}
	public String getMemGender() {
		return memGender;
	}
	public void setMemGender(String memGender) {
		this.memGender = memGender;
	}
	public String getMemEmail() {
		return memEmail;
	}
	public void setMemEmail(String memEmail) {
		this.memEmail = memEmail;
	}
	public String getMemPhone() {
		return memPhone;
	}
	public void setMemPhone(String memPhone) {
		this.memPhone = memPhone;
	}
	public String getMemAddr() {
		return memAddr;
	}
	public void setMemAddr(String memAddr) {
		this.memAddr = memAddr;
	}
	public MultipartFile getMemProfile() {
		return memProfile;
	}
	public void setMemProfile(MultipartFile memProfile) {
		this.memProfile = memProfile;
	}
	public String getMemProfileName() {
		return memProfileName;
	}
	public void setMemProfileName(String memProfileName) {
		this.memProfileName = memProfileName;
	}
	@Override
	public String toString() {
		return "MEMBER [memId=" + memId + ", memPw=" + memPw + ", memName=" + memName + ", memBirth=" + memBirth
				+ ", memGender=" + memGender + ", memEmail=" + memEmail + ", memPhone=" + memPhone + ", memAddr="
				+ memAddr + ", memProfile=" + memProfile + ", memProfileName=" + memProfileName + "]";
	}
	
	
	
	
	
	// getter, setter, toString
	
}
