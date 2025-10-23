package org.example.streamOperation.mapFlatMap;

import java.util.List;
import java.util.Objects;

public class Customer {
    private int id;
    private String custName;
    private String emailId;
    private List<String> phoneNumbers;

    public Customer(int id, String custName, String emailId, List<String> phoneNumbers) {
        this.id = id;
        this.custName = custName;
        this.emailId = emailId;
        this.phoneNumbers = phoneNumbers;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id == customer.id && Objects.equals(custName, customer.custName) && Objects.equals(emailId, customer.emailId) && Objects.equals(phoneNumbers, customer.phoneNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, custName, emailId, phoneNumbers);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", custName='" + custName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}
