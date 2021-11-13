package com.cg.spring.boot.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComCgSpringBootDemoOct12Application {

	public static void main(String[] args) {
		
		final Logger LOG = LoggerFactory.getLogger(ComCgSpringBootDemoOct12Application.class);
		LOG.info("Start");
	  //  System.out.println("Start.....");
	    SpringApplication.run(ComCgSpringBootDemoOct12Application.class, args);
	  //  System.out.println("End");
	    LOG.info("Stop");
	}

}
