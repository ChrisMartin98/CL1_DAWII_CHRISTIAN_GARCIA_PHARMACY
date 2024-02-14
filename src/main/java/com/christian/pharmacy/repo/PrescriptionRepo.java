package com.christian.pharmacy.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.christian.pharmacy.model.Prescription;

public interface PrescriptionRepo extends JpaRepository<Prescription, Integer> {

}
