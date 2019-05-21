package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/")
public class PageController {
	/**
	 * 主页
	 * @return
	 */
	@RequestMapping("doIndexUI")
	public String doIndexUI(){
		return "index";
	}
	/**
	 * 登录页面
	 * @return
	 */
//	@RequestMapping("doLoginUI")
//	public String doLoginUI(){
//		return "login";
//	}
}