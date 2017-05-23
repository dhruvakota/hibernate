package com.dhruva.domain;

import org.springframework.batch.item.ItemProcessor;

import com.dhruva.model.Patient;

public class PatientProcessor implements ItemProcessor<Patient, Patient> {

	public Patient process(Patient result) throws Exception {
		
		
		return result;
	}
}
