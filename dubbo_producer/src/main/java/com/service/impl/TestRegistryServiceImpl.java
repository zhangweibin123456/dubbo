package com.service.impl;

import org.springframework.stereotype.Service;

import test.service.TestRegistryService;

@Service("testRegistryService")
public class TestRegistryServiceImpl implements TestRegistryService{

	@Override
	public String hello(String name) {
		 return "hello "+name;
	}

}
