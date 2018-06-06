package com.example.demo.user.service;

import java.util.List;

import com.example.demo.user.model.LogingUse;

public interface UserService {
    
	int addUser(LogingUse user);

    List<LogingUse> findAllUser(int pageNum, int pageSize);
}
