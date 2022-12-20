package com.icia.mbpro.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BDAO {
	
	@Autowired
	private SqlSessionTemplate sql;

}
