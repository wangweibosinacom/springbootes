package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.example.demo.user.dao")
@SpringBootApplication
public class Demo1Application 
{
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
}
