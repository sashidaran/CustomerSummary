package com.sashi.springCrud.SpringCrudRepository;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerSummary {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer customerId;
    private String customerFirstName;
    private String customerLastName;
    private String customerEmailId;
    private String customerUserId;
    private String customerCreateDate;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerEmailId() {
        return customerEmailId;
    }

    public void setCustomerEmailId(String customerEmailId) {
        this.customerEmailId = customerEmailId;
    }

    public String getCustomerUserId() {
        return customerUserId;
    }

    public void setCustomerUserId(String customerUserId) {
        this.customerUserId = customerUserId;
    }

    public String getCustomerCreateDate() {
        return customerCreateDate;
    }

    public void setCustomerCreateDate(String customerCreateDate) {
        this.customerCreateDate = customerCreateDate;
    }

    protected CustomerSummary() {}

    public CustomerSummary(Integer customerId, String customerFirstName, String customerLastName, String customerEmailId, String customerCreateDate, String customerUserId) {
        this.customerId = customerId;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerEmailId = customerEmailId;
        this.customerUserId = customerUserId;
        this.customerCreateDate = customerCreateDate;
    }


    @Override
    public String toString() {
        return String.format(
                "CustomerSummary[customerId=%d, customerFirstName='%s', customerLastName='%s', customerEmailId='%s', customerCreateDate='%s', customerUserId='%s']",
                customerId, customerFirstName, customerLastName, customerEmailId, customerCreateDate, customerUserId);
    }
}
