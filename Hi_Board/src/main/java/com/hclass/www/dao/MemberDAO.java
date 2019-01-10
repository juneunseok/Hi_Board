package com.hclass.www.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.hclass.www.vo.*;

public class MemberDAO {
	@Autowired
	SqlSessionTemplate sqlSession;
	
	public int countIdPw(MemberVO mVO) {
		return sqlSession.selectOne("mSQL.login", mVO);
	}
}
