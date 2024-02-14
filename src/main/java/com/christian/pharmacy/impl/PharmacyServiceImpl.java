package com.christian.pharmacy.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.christian.pharmacy.model.Pharmacy;
import com.christian.pharmacy.repo.PharmacyRepo;
import com.christian.pharmacy.service.PharmacyService;

@Service
public class PharmacyServiceImpl implements PharmacyService {

	@Autowired
	PharmacyRepo pharmacyRepo;
	
	@Override
	public List<Pharmacy> list() {
		// TODO Auto-generated method stub
		return pharmacyRepo.findAll();
	}

	@Override
	public Pharmacy add(Pharmacy p) {
		// TODO Auto-generated method stub
		return pharmacyRepo.save(p);
	}

	@Override
	public Pharmacy update(Pharmacy p) {
		// TODO Auto-generated method stub
		return pharmacyRepo.save(p);
	}

	@Override
	public void delete(int p) {
		// TODO Auto-generated method stub
		pharmacyRepo.deleteById(p);
		
	}

	
	
	
}



