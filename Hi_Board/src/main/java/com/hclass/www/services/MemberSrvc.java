package com.hclass.www.services;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.*;

import com.hclass.www.dao.*;
import com.hclass.www.vo.*;

public class MemberSrvc {
	@Autowired
	MemberDAO mDAO;
	
	/**
	 *  로그인 처리 서비스 함수
	 * @param mVO
	 * @param rv
	 * @return
	 */
	public ModelAndView loginService(ModelAndView mv, MemberVO mVO, RedirectView rv, HttpSession session) {
		
		int cnt = mDAO.countIdPw(mVO);
		if(cnt == 1) {
			session.setAttribute("SID", mVO.getId());
			rv.setUrl("../board/ReBoardList.class");
		} else {
			rv.setUrl("../member/LoginForm.class");
		}
		mv.setView(rv);
		
		return mv;
	}
	
}
