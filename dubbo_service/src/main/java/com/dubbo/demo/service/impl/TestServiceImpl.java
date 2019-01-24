package com.dubbo.demo.service.impl;

import com.dubbo.demo.service.TestService;
import org.springframework.stereotype.Service;

@Service("testService")
public class TestServiceImpl implements TestService {

	public String testSayDubbo() {
		System.out.println("---testSayDubbo----服务被调用----------");
		//StringBuffer stringBuffer = new StringBuffer();
		//stringBuffer.append("Dubbo say:Hello!!!!!");
		Entity entity = new Entity();
		entity.setService("hello");
		return entity.toString();
	}

	/*public String say(String name) {
		System.out.println("----say---服务被调用----------");
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(name + " say:Hello!!!!!");
		return stringBuffer.toString();
	}*/
}
