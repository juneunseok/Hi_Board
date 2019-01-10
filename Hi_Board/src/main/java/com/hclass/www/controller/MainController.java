package com.hclass.www.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String getMain() {
		return "main";
	}
}
