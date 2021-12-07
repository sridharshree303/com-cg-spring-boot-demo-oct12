package com.cg.spring.boot.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.boot.demo.model.AppUser;
import com.cg.spring.boot.demo.service.AppUserService;

@RestController
public class AppUserController {

	private static final Logger LOG = LoggerFactory.getLogger(AppUserController.class);
	
	@Autowired
	private AppUserService appuserService;
	
	@CrossOrigin(origins = "*")
	@PostMapping("/regist/{appuser}")
	public AppUser regist(@RequestBody AppUser appuser) {
		LOG.info(" appUser Service ");
		return appuserService.register(appuser);
	}
	
	@CrossOrigin(origins = "*")
	@GetMapping("/logn/{appuser}")
	public AppUser logn(@RequestBody AppUser appuser) {
		LOG.info("Logn");
		return appuserService.login(appuser);
	}
	
}
