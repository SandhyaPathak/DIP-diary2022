package com.medical.record.dip.service;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.medical.record.dip.model.PatientData;

public interface DataService extends MongoRepository<PatientData, String>{

}
