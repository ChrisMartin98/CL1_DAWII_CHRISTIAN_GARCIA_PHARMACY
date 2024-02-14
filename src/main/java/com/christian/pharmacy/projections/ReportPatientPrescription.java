package com.christian.pharmacy.projections;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({
    "patientId",
    "patientFName",
    "patientLName",
    "prescriptionCost"
})

public interface ReportPatientPrescription {

	
	
	@JsonProperty("patientId")
    Integer getPatient_id();
    
    @JsonProperty("patientFName")
    String getName(); 
    
    @JsonProperty("patientLName")
    String getLastname(); 
    
    @JsonProperty("prescriptionCost")
    Double getTotalPrescriptionCost(); 


	
}
