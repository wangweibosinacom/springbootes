package com.example.demo.user.service.impl;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.user.dao.LogingUseMapper;
import com.example.demo.user.dao.LogingUserDao;
import com.example.demo.user.model.LogingUse;
import com.example.demo.user.service.UserService;
import com.github.pagehelper.PageHelper;
@Service(value = "userService")
//@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,timeout=36000,rollbackFor=Exception.class)
public class UserServiceImpl implements UserService {

	@Autowired
	private LogingUseMapper userMapper;
	@Autowired
	private LogingUserDao userDao ;
	@Override
	public int addUser(LogingUse user) {
		Date date;
		user.setId(UUID.randomUUID().toString().replaceAll("-", ""));
		user.setCreateTime(date = new Date());
		user.setUpTime(date);
		user.setState("1");
		return userMapper.insert(user);
	}

	@Override
	public List<LogingUse> findAllUser(int pageNum, int pageSize) {
		//将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
		return userDao.selectByPrimaryAll(null);
	}

}
