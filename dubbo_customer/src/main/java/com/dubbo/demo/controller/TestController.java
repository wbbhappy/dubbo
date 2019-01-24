package com.dubbo.demo.controller;

import com.dubbo.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	@Autowired
	private TestService testService;
	
	@RequestMapping("/testDubbo")
	@ResponseBody
	public String testDubbo(){
		System.out.println("进入Controller层方法");
		return testService.testSayDubbo().toString();
	}

	@RequestMapping("/testSay")
	@ResponseBody
	public String testSay(){
		System.out.println("进入Controller层方法");
		return "访问controller层方法成功。";
	}
}
