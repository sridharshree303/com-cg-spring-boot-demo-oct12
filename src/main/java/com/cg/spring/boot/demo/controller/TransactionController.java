package com.cg.spring.boot.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.boot.demo.service.TransactionService;

@RestController
public class TransactionController {

	private TransactionService transactionService;
	
	@GetMapping("/check")
	public String checking() {
		System.out.println("working");
		return "Its working";
	}
}
