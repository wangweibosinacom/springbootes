package com.example.demo.user;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.user.controller.UserController;
import com.example.demo.user.model.LogingUse;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest
{
	@Autowired
	private UserController user;
	@Test
	public void saveUser() {
		LogingUse userdate;
		for(int i=0; i<3 ; i++) {
			userdate = createUser("wenwen"+i,"123456");
			user.addUser(userdate);
		}
	}
	@Test
	public void queryAll() {
		List<LogingUse> users;
		users = (List<LogingUse>)user.findAllUser(1, 5);
		for(LogingUse subUser : users) 
		{
			System.out.println(subUser);
		}
	}

	private LogingUse createUser(String logingName, String password) {
		Date date;
		LogingUse user = new LogingUse();
		user.setLogingName(logingName);
		user.setLogingPassword(password);
		user.setId(UUID.randomUUID().toString().replaceAll("-",""));
		user.setState("1");
		user.setCreateTime(date = new Date());
		user.setUpTime(date);
		return user;
	}
}
