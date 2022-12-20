package com.icia.mbpro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icia.mbpro.dao.BDAO;

@Service
public class BService {
	
	@Autowired
	private BDAO bdao;
	

}
