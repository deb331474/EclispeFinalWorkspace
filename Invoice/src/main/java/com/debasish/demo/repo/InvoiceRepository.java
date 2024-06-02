package com.debasish.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.debasish.demo.entity.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
	

}
