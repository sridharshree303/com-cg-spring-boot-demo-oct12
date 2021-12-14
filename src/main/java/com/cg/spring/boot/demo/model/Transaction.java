package com.cg.spring.boot.demo.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int transactionId;
	
	private LocalDate transactionDate;
	
	private Transact transactionType;
	
	private int noOfStocks;

	@ManyToOne
	@JoinColumn(name="investorId")
	private Investor Investor;

	@ManyToOne
	@JoinColumn(name="stockId")
	private Stock stocks;

	private int totalAmount;

	public Transaction() {
		super();
	}

	public Transaction(int transactionId, LocalDate transactionDate, Transact transactionType, int noOfStocks,
			com.cg.spring.boot.demo.model.Investor investor, Stock stocks, int totalAmount) {
		super();
		this.transactionId = transactionId;
		this.transactionDate = transactionDate;
		this.transactionType = transactionType;
		this.noOfStocks = noOfStocks;
		Investor = investor;
		this.stocks = stocks;
		this.totalAmount = totalAmount;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public LocalDate getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Transact getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(Transact transactionType) {
		this.transactionType = transactionType;
	}

	public int getNoOfStocks() {
		return noOfStocks;
	}

	public void setNoOfStocks(int noOfStocks) {
		this.noOfStocks = noOfStocks;
	}

	public Investor getInvestor() {
		return Investor;
	}

	public void setInvestor(Investor investor) {
		Investor = investor;
	}

	public Stock getStocks() {
		return stocks;
	}

	public void setStocks(Stock stocks) {
		this.stocks = stocks;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", transactionDate=" + transactionDate
				+ ", transactionType=" + transactionType + ", noOfStocks=" + noOfStocks + ", Investor=" + Investor
				+ ", stocks=" + stocks + ", totalAmount=" + totalAmount + "]";
	}

	
}
