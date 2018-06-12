package com.example.demo.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.user.model.LogingUse;
import com.example.demo.user.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

//swagger-ui.html
@Api(tags="APP用户注册")
@Controller
@RequestMapping(value = "/user")
public class UserController 
{
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value = "/", method=RequestMethod.GET)
    public String toIndex(LogingUse user){
        return "/index";
    }
    @ApiOperation(value="创建用户", notes="根据User对象创建用户")
    @ApiImplicitParam(name = "user", value = "用户详细实体user", required = true, dataType = "User")
    @ResponseBody
    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"},method=RequestMethod.POST)
    public int addUser(LogingUse user){
        return userService.addUser(user);
    }

    @ResponseBody
    @ApiOperation(value="获取用户列表", notes="")
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"}, method=RequestMethod.GET)
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize)
    {
        return userService.findAllUser(pageNum,pageSize);
    }
}
