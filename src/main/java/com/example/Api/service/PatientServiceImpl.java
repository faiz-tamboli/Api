package com.example.Api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Api.model.Patient;
import com.example.Api.repository.PatientRepo;



@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	private PatientRepo patientRepo;

	@Override
	public List<Patient> getPatient() {
		return patientRepo.findAll();
		}
	
	@Override
	public void save(Patient patient) {
		patientRepo.save(patient);
		
	}
	@Override
	public Patient findById(Integer id) {

		Optional<Patient> patientResult = patientRepo.findById(id);
		Patient patient = null;
		if (patientResult.isPresent()) {
			patient = patientResult.get();
		} 
		return patient;
	}

	@Override
	public void delete(Patient patient) {
		patientRepo.delete(patient);
		
	}

	
	

}

