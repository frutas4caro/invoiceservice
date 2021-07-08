package com.example.invoice.invoiceservice.model;

import javax.persistence.*;

@Entity
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Integer customerId;

    @Column
    private String invoiceNumber;

    @Column
    private String vendorName;

    @Column
    private Integer amount;

    @Column(length = 2000)
    private String invoiceDescription;

    public Invoice(Integer customerId, String invoiceNumber, String vendorName, Integer amount, String invoiceDescription){
        this.customerId = customerId;
        this.invoiceNumber = invoiceNumber;
        this.vendorName = vendorName;
        this.amount = amount;
        this.invoiceDescription = invoiceDescription;
    }

    protected Invoice(){

    }

    public Long getId() {
        return id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getInvoiceDescription() {
        return invoiceDescription;
    }

    public void setInvoiceDescription(String invoiceDescription) {
        this.invoiceDescription = invoiceDescription;
    }
}
