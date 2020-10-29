package com.java.service;

import java.text.ParseException;
import java.util.List;

import com.java.dto.CustomerPolicyDTO;
import com.java.model.CustomerPolicy;

public interface CustomerPolicyService {

	public List<CustomerPolicy> getCustomerById(int customerId);

	public CustomerPolicy insertCustomerDetails(CustomerPolicy customers);

	public String payPremiumAmount(CustomerPolicyDTO cusPolicy) throws ParseException;

}
