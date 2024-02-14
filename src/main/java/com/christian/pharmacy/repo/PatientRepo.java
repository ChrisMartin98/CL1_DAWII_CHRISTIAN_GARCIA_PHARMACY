package com.christian.pharmacy.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.christian.pharmacy.model.Patient;
import com.christian.pharmacy.projections.ReportPatientPrescription;



public interface PatientRepo extends JpaRepository<Patient, Integer>{

	@Query(
		    value = "SELECT "
		            + "p.patient_id, "
		            + "p.patientFName AS Name, "
		            + "p.patientLName AS LastName, "
		            + "SUM(pr.prescription_cost) AS totalPrescriptionCost "
		            + "FROM Prescription pr "
		            + "JOIN Patient p ON pr.patient_id = p.patient_id "
		            + "GROUP BY p.patient_id, name, lastname",
		    nativeQuery = true
		)
		public List<ReportPatientPrescription> getReportPatientPrescription();

	
}
