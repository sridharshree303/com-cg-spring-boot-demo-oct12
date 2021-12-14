package com.cg.spring.boot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.spring.boot.demo.model.Transaction;

@Repository
public interface ITransactionDao extends JpaRepository<Transaction, Integer>{
	
	
}