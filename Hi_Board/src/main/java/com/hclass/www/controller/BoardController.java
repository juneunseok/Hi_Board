package com.hclass.www.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("board")
public class BoardController {
	
	@RequestMapping("/ReBoardList.class")
	public ModelAndView boardList(ModelAndView mv) {
		String view = "board/reBoard";
		mv.setViewName(view);
		
		return mv;
	}
}
