package com.debasish.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.debasish.demo.entity.Invoice;

@Component
public interface ServiceInvoice {
	
	Long saveInvoice(Invoice inv);
	// takes invoice object as input abd return PK generated
	
	void updateInvoice(Invoice e);
	//Takes existing invoice data as input and update values
	
	void deleteInvoice(Long id);
	//take id as input and returns one row as one object
	
	Invoice getOneInvoice(Long id);
	//select all rows and provides result as List<Invoice>
	
	List<Invoice> getAllInvoices();
	
	//take id as input,checks if record exists returns true, else false
	
	boolean isInvoiceExist(Long id);
	
	Integer updateInvoiceNumberById(String number, Long id);
	

}
