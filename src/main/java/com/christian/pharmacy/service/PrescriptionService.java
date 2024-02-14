package com.christian.pharmacy.service;

import java.util.List;
import com.christian.pharmacy.model.Prescription;

public interface PrescriptionService {
	public List<Prescription> list();
	public Prescription add(Prescription p);
	public Prescription update(Prescription p);
	public void delete(int p);
}
