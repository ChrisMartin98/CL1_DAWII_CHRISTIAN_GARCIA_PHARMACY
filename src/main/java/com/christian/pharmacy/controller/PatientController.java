package com.christian.pharmacy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.christian.pharmacy.model.Patient;
import com.christian.pharmacy.service.PatientService;

@RestController
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	PatientService patientService; 
	
	@GetMapping
	public ResponseEntity<List<Patient>> list() {
		return new ResponseEntity<List<Patient>>(patientService.list(),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Patient> add( @RequestBody Patient m){
		return new ResponseEntity<Patient>(patientService.add(m),HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Patient> update( @RequestBody Patient m) {
		return new ResponseEntity<Patient>(patientService.update(m),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int id) {
		patientService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	//
	/*@GetMapping("/ReportInvoicePrescription")
	public ResponseEntity<List<ReportInvoicePrescription>> getReportClass() {
	return new ResponseEntity<> (patientService.getReportInvoicePrescription(), HttpStatus.OK);
	}*/

}
