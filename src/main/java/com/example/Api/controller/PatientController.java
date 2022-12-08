package com.example.Api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Api.model.Patient;
import com.example.Api.service.PatientService;


@RestController
@RequestMapping("/api")
public class PatientController {
	
	@Autowired
	private PatientService patientService;
	
	@GetMapping("/Patients")
	public List<Patient> getPatient(){
		return patientService.getPatient();
		
	}
	@PostMapping("/save")
	public Patient savePatient(@RequestBody Patient patient) {
		patientService.save(patient);
		return patient;
	}
	@PutMapping("/update/{id}")
	public Patient UpdatePatient(@PathVariable int id,@RequestBody Patient patientDetail) {
		{
			Patient patient=patientService.findById(id);
			patient.setFirstname(patientDetail.getFirstname());
			patient.setLastname(patientDetail.getLastname());
			patient.setContact(patientDetail.getContact());
			patientService.save(patient);
			return patient;
		}
		
	}
	
	@GetMapping("/patient/{id}")//since it is 1 variable so added in path variable
	public Patient getPatientById(@PathVariable Integer id) {
		Patient patient = patientService.findById(id);
		return patient;
	}
	@DeleteMapping("/delete/{id}")
	public Patient deletePatient(@PathVariable int id) {
		Patient patient=patientService.findById(id);
		patientService.delete(patient);
		return patient;
	}
	
	
	

}
