package com.example.invoice.invoiceservice.service;

import com.example.invoice.invoiceservice.model.Invoice;
import com.example.invoice.invoiceservice.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    // Create an invoice

    public Invoice createInvoice(Integer customerId, String invoiceNumber, String vendorName, Integer amount, String invoiceDescription){
        return invoiceRepository.save(new Invoice(customerId, invoiceNumber, vendorName, amount, invoiceDescription));
    }

    // Read an invoice by invoice id

    public Optional<Invoice> readInvoice(Long id){
        return invoiceRepository.findById(id);
    }

    // Read all of the invoice associated to a customer

    public List<Invoice> getInvoicesForCustomer(Integer customerId){
        return invoiceRepository.findByCustomerId(customerId);
    }

    // Delete an invoice
    public void deleteInvoice(Long id){
//        invoiceRepository.findById(id).ifPresent(i -> invoiceRepository.delete(i));
        Invoice invoice = invoiceRepository.findById(id).orElseThrow(() -> new RuntimeException("Invoice does not exist or cannot be deleted"));
        invoiceRepository.delete(invoice);
    }


}
