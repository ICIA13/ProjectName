package com.icia.mbpro.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.icia.mbpro.dto.MEMBER;

@Repository
public class MDAO {

	@Autowired
	private SqlSessionTemplate sql;
	
	public int mJoin(MEMBER member) {
		System.out.println("[3] dao member : " + member);
		return sql.insert("Member.mJoin", member);
	}

	public String mLogin(String memId) {
		System.out.println("[3] dao memId : " + memId);
		return sql.selectOne("Member.mLogin", memId);
	}

	public List<MEMBER> mList() {
		
		return sql.selectList("Member.mList");
	}

	public MEMBER mView(String memId) {
		return sql.selectOne("Member.mView", memId);
	}

}
