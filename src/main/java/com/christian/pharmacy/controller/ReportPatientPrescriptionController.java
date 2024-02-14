package com.christian.pharmacy.controller;

import com.christian.pharmacy.projections.ReportPatientPrescription;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.christian.pharmacy.service.PatientService;

@RestController
@RequestMapping("/reportes")
public class ReportPatientPrescriptionController {

	@Autowired
	PatientService patientService;


	@GetMapping("/paciente")
	public ResponseEntity<List<ReportPatientPrescription>> list() {
	    List<ReportPatientPrescription> report = patientService.getReportPatientPrescription();
	    return new ResponseEntity<>(report, HttpStatus.OK);
	}


}
