package com.medical.record.dip.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.medical.record.dip.model.PatientData;
import com.medical.record.dip.service.DataService;

@RestController
public class DataController {
	@Autowired
	private DataService repo;
	
	@PostMapping("/addPatientData")
	public String saveData(@RequestBody PatientData data) {
		repo.save(data);
		return "Added patient data with id: " + data.getPatientId();
		
	}
	
	@GetMapping("/getAllData")
	public List<PatientData> getData(){
		return repo.findAll();
	}
	
	@GetMapping("/getDataById/{id}")
	public Optional<PatientData> getById(@PathVariable String id){
		return repo.findById(id);
	}
	
	@DeleteMapping("/deleteData/{id}")
	public String deleteData(@PathVariable String id) {
		repo.deleteById(id);
		return "Patient Data deleted with id: " +id;
	}

	@PutMapping("/updateData/{id}")
	public String updateData(@PathVariable String id, @RequestBody PatientData data) {
		repo.save(data);
		return "Data updation successfull!!";
	}

}
