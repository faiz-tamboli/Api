package com.example.Api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Api.model.Patient;

@Repository
public interface PatientRepo extends JpaRepository<Patient,Integer> {
	Patient findByid (int id);
	

}
