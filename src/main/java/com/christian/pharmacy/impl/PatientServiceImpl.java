package com.christian.pharmacy.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.christian.pharmacy.model.Patient;
import com.christian.pharmacy.projections.ReportPatientPrescription;
import com.christian.pharmacy.repo.PatientRepo;
import com.christian.pharmacy.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	PatientRepo patientRepo; 
	
	
	@Override
	public List<Patient> list() {
		// TODO Auto-generated method stub
		return patientRepo.findAll();
	}

	@Override
	public Patient add(Patient p) {
		// TODO Auto-generated method stub
		return patientRepo.save(p);
	}

	@Override
	public Patient update(Patient p) {
		// TODO Auto-generated method stub
		return patientRepo.save(p);
	}

	@Override
	public void delete(int p) {
		// TODO Auto-generated method stub
		patientRepo.deleteById(p);
		
	}

	//
	@Override
	public List<ReportPatientPrescription> getReportPatientPrescription() {
		// TODO Auto-generated method stub
		return patientRepo.getReportPatientPrescription();
	}



}
