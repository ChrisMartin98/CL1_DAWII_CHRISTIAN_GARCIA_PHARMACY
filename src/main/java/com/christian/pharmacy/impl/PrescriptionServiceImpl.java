package com.christian.pharmacy.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.christian.pharmacy.model.Prescription;
import com.christian.pharmacy.repo.PrescriptionRepo;
import com.christian.pharmacy.service.PrescriptionService;

@Service
public class PrescriptionServiceImpl implements PrescriptionService {

	@Autowired
	PrescriptionRepo prescriptionRepo; 
	
	@Override
	public List<Prescription> list() {
		// TODO Auto-generated method stub
		return prescriptionRepo.findAll();
	}

	@Override
	public Prescription add(Prescription p) {
		// TODO Auto-generated method stub
		return prescriptionRepo.save(p);
	}

	@Override
	public Prescription update(Prescription p) {
		// TODO Auto-generated method stub
		return prescriptionRepo.save(p);
	}

	@Override
	public void delete(int p) {
		// TODO Auto-generated method stub
		prescriptionRepo.deleteById(p);
		
	}

}
