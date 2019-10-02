package com.baeldung.spring.cloud.archaius.basic.controller;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.baeldung.spring.cloud.archaius.basic.BasicArchaiusApplication;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BasicArchaiusApplication.class);
	}

}

