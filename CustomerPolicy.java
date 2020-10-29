package com.java.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "customer_insurance")
public class CustomerPolicy {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer policyNumber;

	private Integer customerId;

	@JsonFormat(pattern = "dd/MM/yyyy hh:mm")
	private Date startDate;

	@JsonFormat(pattern = "dd/MM/yyyy hh:mm")
	private Date endDate;

	private Double premiumAmount;

	@ManyToOne
	private InsuranceType insurance;

	public Integer getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(Integer policyNumber) {
		this.policyNumber = policyNumber;
	}

	public Double getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(Double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public InsuranceType getInsurance() {
		return insurance;
	}

	public void setInsurance(InsuranceType insurance) {
		this.insurance = insurance;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

}
