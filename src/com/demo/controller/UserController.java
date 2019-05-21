package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.common.vo.JsonResult;
import com.demo.entity.User;
import com.demo.service.UserService;
@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
    private UserService userService;//持有一个业务层对象
	//ajax查询数据
    @RequestMapping("/findAllById")
    @ResponseBody
    public JsonResult findAllById(@RequestParam("uId")int id) {
    	User user = userService.findAllById(id);
        return new JsonResult(user);
    }
}