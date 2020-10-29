package com.java.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.model.CustomerPolicy;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerPolicy, Integer> {

	List<CustomerPolicy> findByCustomerId(int customerId);

	/*
	 * @Query(value = "select * from food_items c where c.food_name = :foodName",
	 * nativeQuery = true) List<FoodItem> searchFoodItemName(@Param("foodName")
	 * String foodName);
	 * 
	 * 
	 * List<FoodItem> findByFoodNameContains(String foodName);
	 */
}
