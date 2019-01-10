package com.hclass.www.controller;

import javax.servlet.http.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.*;

import com.hclass.www.services.*;
import com.hclass.www.vo.*;

/**
 * @author 	Jun eunseok
 * @since  	2019/01/07
 * @version	v1.0
 * 
 * 			회원 관련 요청 처리 컨트롤러
 * 				2019/01/07 	- 컨트롤러 제작 : 전은석
 */

@Controller
@RequestMapping("member")
public class MemberController {
	@Autowired
	MemberSrvc mSrvc;
	
	@RequestMapping("/LoginForm.class")
	public ModelAndView loginForm(ModelAndView mv) {
		String view = "main";
		mv.setViewName(view);
		return mv;
	}
	
	@RequestMapping("/Login.class")
	public ModelAndView loginProc(ModelAndView mv, RedirectView rv, MemberVO mVO, HttpSession session) {
		mv = mSrvc.loginService(mv, mVO, rv, session);
		return mv;
	}
	
	
}
