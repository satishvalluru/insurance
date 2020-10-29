package com.java.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.model.InsuranceType;

@Repository
public interface InsuranceTypeRepository extends JpaRepository<InsuranceType, Integer> {

	List<InsuranceType> findByInsuranceNameContains(String insuranceName);

}
