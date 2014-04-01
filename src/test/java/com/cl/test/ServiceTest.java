package com.cl.test;

import java.util.List;

import hhjt.bean.Info;
import hhjt.service.InfoService;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class ServiceTest {

	@Resource
	private InfoService ifs;
	
	@Test
	public void test() {
		List<Info> allInfos = ifs.getAllInfos();
		for(Info info : allInfos) {
			System.out.println(info.getTitle());
		}
	}
}
