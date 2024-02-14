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
import com.christian.pharmacy.model.Prescription;
import com.christian.pharmacy.service.PrescriptionService;

@RestController
@RequestMapping("/prescription")
public class PrescriptionController {

	@Autowired
	PrescriptionService prescriptionService; 
	
	@GetMapping
	public ResponseEntity<List<Prescription>> list() {
		return new ResponseEntity<List<Prescription>>(prescriptionService.list(),HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Prescription> add( @RequestBody Prescription m){
		return new ResponseEntity<Prescription>(prescriptionService.add(m),HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Prescription> update( @RequestBody Prescription m) {
		return new ResponseEntity<Prescription>(prescriptionService.update(m),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") int id) {
		prescriptionService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	
}
