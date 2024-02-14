package com.christian.pharmacy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.christian.pharmacy.model.Pharmacy;

public interface PharmacyRepo extends JpaRepository<Pharmacy, Integer>{

	
	
}
