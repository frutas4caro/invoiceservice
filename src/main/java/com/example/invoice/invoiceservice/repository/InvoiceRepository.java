package com.example.invoice.invoiceservice.repository;

import com.example.invoice.invoiceservice.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
    public List<Invoice> findByCustomerId(Integer customerId);
}
