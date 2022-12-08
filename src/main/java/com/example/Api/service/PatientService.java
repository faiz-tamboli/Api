package com.example.Api.service;

import java.util.List;

import com.example.Api.model.Patient;

public interface PatientService {
	
	public List<Patient> getPatient();

	Patient findById(Integer id);

	public void save(Patient patient);
	
	public void delete(Patient patient);
	

}
