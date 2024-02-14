package com.christian.pharmacy.service;

import java.util.List;

import com.christian.pharmacy.model.Patient;
import com.christian.pharmacy.projections.ReportPatientPrescription;



public interface PatientService {

	public List<Patient> list();
	public Patient add(Patient p);
	public Patient update(Patient p);
	public void delete(int p);
	

	
	//
	public List<ReportPatientPrescription> getReportPatientPrescription();
	
	
	
	
}
