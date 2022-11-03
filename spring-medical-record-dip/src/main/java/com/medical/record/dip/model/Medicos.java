package com.medical.record.dip.model;

import java.util.Arrays;

public class Medicos {
	
	private String[] existingDisease;
	private String[] familyHistory;
	private String[] healthRisk;
	private String[] geneticDetails;
	
	public String[] getExistingDisease() {
		return existingDisease;
	}
	public void setExistingDisease(String[] existingDisease) {
		this.existingDisease = existingDisease;
	}
	public String[] getFamilyHistory() {
		return familyHistory;
	}
	public void setFamilyHistory(String[] familyHistory) {
		this.familyHistory = familyHistory;
	}
	public String[] getHealthRisk() {
		return healthRisk;
	}
	public void setHealthRisk(String[] healthRisk) {
		this.healthRisk = healthRisk;
	}
	public String[] getGeneticDetails() {
		return geneticDetails;
	}
	public void setGeneticDetails(String[] geneticDetails) {
		this.geneticDetails = geneticDetails;
	}
	
	@Override
	public String toString() {
		return "Medicos [existingDisease=" + Arrays.toString(existingDisease) + ", familyHistory="
				+ Arrays.toString(familyHistory) + ", healthRisk=" + Arrays.toString(healthRisk) + ", geneticDetails="
				+ Arrays.toString(geneticDetails) + "]";
	}
}
