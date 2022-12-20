package com.icia.mbpro.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.icia.mbpro.dto.MEMBER;
import com.icia.mbpro.service.MService;

@Controller
public class MController {
	
	@Autowired
	private MService msvc;
	
	private ModelAndView mav = new ModelAndView();
	
	
	// 프로젝트 첫 페이지
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		// src/main/webapp/WEB-INF/views에 있는 jsp 요청(index.jsp 실행)
		return "index";
	}
	
	// mJoinForm : 회원가입 페이지 요청
	@RequestMapping(value = "/mJoinForm", method = RequestMethod.GET)
	public String mJoinForm() {
		return "M_Join";
	}
	
	// mJoin : 회원가입
	@RequestMapping(value = "/mJoin", method = RequestMethod.POST)
	public ModelAndView mJoin(@ModelAttribute MEMBER member) throws IllegalStateException, IOException {
		System.out.println();
		System.out.println(" ============= 회원가입 메소드 ============= ");
		System.out.println("[1] controller member : " + member);
		
		mav = msvc.mJoin(member);
		System.out.println("[5] controller mav : " + mav);
		
		return mav;
	}
	
	// mLoginForm : 로그인 페이지 요청
	@RequestMapping(value = "/mLoginForm", method = RequestMethod.GET)
	public String mLoginForm() {
		return "M_Login";
	}
	
	// mLogin : 로그인 (회원가입 내용 복사)
	@RequestMapping(value = "/mLogin", method = RequestMethod.POST)
	public ModelAndView mLogin(@ModelAttribute MEMBER member) {
		System.out.println();
		System.out.println(" ============= 로그인 메소드 ============= ");
		System.out.println("[1] controller member : " + member);
		
		mav = msvc.mLogin(member);
		System.out.println("[5] controller mav : " + mav);
		
		return mav;
	}
	
	// 회원목록 : mList
	@RequestMapping(value = "/mList", method = RequestMethod.GET)
	public ModelAndView mList() {
		System.out.println();
		System.out.println(" ============= 회원목록 메소드 ============= ");
		System.out.println("[1] controller");
		
		mav = msvc.mList();
		System.out.println("[5] controller mav : " + mav);
		
		return mav;
	}
	
	// mView 회원상세보기
	@RequestMapping(value = "/mView", method = RequestMethod.GET)
	public ModelAndView mView(@RequestParam("memId")String memId) {
		System.out.println();
		System.out.println(" ============= 회원상세보기 메소드 ============= ");
		System.out.println("[1] controller memId : " + memId);
		
		mav = msvc.mView(memId);
		System.out.println("[5] controller mav : " + mav);
		
		return mav;
	}
	
	
	
}













