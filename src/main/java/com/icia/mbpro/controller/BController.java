package com.icia.mbpro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.icia.mbpro.service.BService;

@Controller
public class BController {

	private ModelAndView mav = new ModelAndView();

	@Autowired
	private BService bsvc;

	// boWriteFrom : 게시글 작성 페이지 요청
	@RequestMapping(value = "/boWriteFrom", method = RequestMethod.GET)
	public String boWriteFrom() {
		return "B_Write";
	}

}







