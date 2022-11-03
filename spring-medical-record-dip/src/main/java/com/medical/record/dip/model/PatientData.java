package com.medical.record.dip.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.medical.record.dip.model.BiochemicalProfile;
import com.medical.record.dip.model.KidneyFunction;
import com.medical.record.dip.model.LipidProfile;
import com.medical.record.dip.model.LiverFunction;
import com.medical.record.dip.model.Medicos;
import com.medical.record.dip.model.Rates;
import com.medical.record.dip.model.ThyroidProfile;
import com.medical.record.dip.model.VitaminData;

@Document(collection = "PatientDetail")
public class PatientData {

	@Id
	private String patientId;
	private String name;
	private String dob;
	private int age;
	private String gender;
	private String identificationMark;
	private String maritalStatus;
	private String address;
	private String ethnicity;
	private double height;
	private double weight;
	private String bloodGroup;
	private String visionProblem;
	private String hearingProblem;
	private Medicos medicalHistory;
	private Rates rate;
	private BiochemicalProfile profile;
	private LipidProfile lipid;
	private KidneyFunction kidney;
	private LiverFunction liver;
	private ThyroidProfile thyroid;
	private VitaminData vitamin;
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getIdentificationMark() {
		return identificationMark;
	}
	public void setIdentificationMark(String identificationMark) {
		this.identificationMark = identificationMark;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEthnicity() {
		return ethnicity;
	}
	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	public String getVisionProblem() {
		return visionProblem;
	}
	public void setVisionProblem(String visionProblem) {
		this.visionProblem = visionProblem;
	}
	public String getHearingProblem() {
		return hearingProblem;
	}
	public void setHearingProblem(String hearingProblem) {
		this.hearingProblem = hearingProblem;
	}
	public Medicos getMedicalHistory() {
		return medicalHistory;
	}
	public void setMedicalHistory(Medicos medicalHistory) {
		this.medicalHistory = medicalHistory;
	}
	public Rates getRate() {
		return rate;
	}
	public void setRate(Rates rate) {
		this.rate = rate;
	}
	public BiochemicalProfile getProfile() {
		return profile;
	}
	public void setProfile(BiochemicalProfile profile) {
		this.profile = profile;
	}
	public LipidProfile getLipid() {
		return lipid;
	}
	public void setLipid(LipidProfile lipid) {
		this.lipid = lipid;
	}
	public KidneyFunction getKidney() {
		return kidney;
	}
	public void setKidney(KidneyFunction kidney) {
		this.kidney = kidney;
	}
	public LiverFunction getLiver() {
		return liver;
	}
	public void setLiver(LiverFunction liver) {
		this.liver = liver;
	}
	public ThyroidProfile getThyroid() {
		return thyroid;
	}
	public void setThyroid(ThyroidProfile thyroid) {
		this.thyroid = thyroid;
	}
	public VitaminData getVitamin() {
		return vitamin;
	}
	public void setVitamin(VitaminData vitamin) {
		this.vitamin = vitamin;
	}
	@Override
	public String toString() {
		return "PatientData [patientId=" + patientId + ", name=" + name + ", dob=" + dob + ", age=" + age + ", gender="
				+ gender + ", identificationMark=" + identificationMark + ", maritalStatus=" + maritalStatus
				+ ", address=" + address + ", ethnicity=" + ethnicity + ", height=" + height + ", weight=" + weight
				+ ", bloodGroup=" + bloodGroup + ", visionProblem=" + visionProblem + ", hearingProblem="
				+ hearingProblem + ", medicalHistory=" + medicalHistory + ", rate=" + rate + ", profile=" + profile
				+ ", lipid=" + lipid + ", kidney=" + kidney + ", liver=" + liver + ", thyroid=" + thyroid + ", vitamin="
				+ vitamin + "]";
	}
	
	
}
