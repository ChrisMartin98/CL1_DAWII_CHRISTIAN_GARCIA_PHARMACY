package com.christian.pharmacy.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data //El lombok hace el getters and setters
@Entity
@Table(name = "Appointment")
public class Appointment {
	
	private LocalDate date;
	private LocalTime time;
	
	@Id
	@ManyToOne
	@JoinColumn(name="doctorId")
	private Doctor doctorId;
	
	@Id
	@ManyToOne
	@JoinColumn(name="patientId")
	private Patient patientId;
	
}
