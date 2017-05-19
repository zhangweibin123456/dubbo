package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import test.service.TestRegistryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class RegistryServiceTest {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private TestRegistryService demoService;
	@Test
	public void testHello() {
		String hello = demoService.hello(" word");
		logger.info("..........................注意了 开始................................");
		logger.info(hello);
		logger.info("..........................注意了 结束................................");
	}

}
