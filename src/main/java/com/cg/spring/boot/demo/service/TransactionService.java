package com.cg.spring.boot.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.boot.demo.model.Transaction;
import com.cg.spring.boot.demo.repository.ITransactionDao;

@Service
public class TransactionService implements ITransactionService{

	@Autowired
	private ITransactionDao itransactionDao;
	
	private final Logger LOG = LoggerFactory.getLogger(TransactionService.class);
	
	public Transaction buyAndSell(Transaction transaction) {
		LOG.info("Buy and Sell of Stocks");
		//write code here
		return null;
	}
	
}

//public Payment companyBuysMilkData(CompanyBuysMilk transaction)
//		throws InvalidTransactionException, PaymentAlreadyFoundException {
//
//	boolean cmp = iCompanyRepository.existsById(transaction.getCompany().getCompanyId());
//	boolean frm = iFarmerRepository.existsById(transaction.getFarmer().getFarmerId());
//	if (frm && cmp) {
//		LOG.info("Transaction Successful ");
//		return icompanybuysmilkrepository.save(transaction);
//	} else {
//		LOG.info("Transaction unsuccessfu;");
//		throw new InvalidTransactionException(transaction.getPaymentId() + " Invalid Buy Order ");
//	}
//}
