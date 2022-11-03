package com.medical.record.dip.model;

public class VitaminData {
	
	private double ferritia;
	private double vitD19;
	private double vitB12;
	public double getFerritia() {
		return ferritia;
	}
	public void setFerritia(double ferritia) {
		this.ferritia = ferritia;
	}
	public double getVitD19() {
		return vitD19;
	}
	public void setVitD19(double vitD19) {
		this.vitD19 = vitD19;
	}
	public double getVitB12() {
		return vitB12;
	}
	public void setVitB12(double vitB12) {
		this.vitB12 = vitB12;
	}
	@Override
	public String toString() {
		return "VitaminData [ferritia=" + ferritia + ", vitD19=" + vitD19 + ", vitB12=" + vitB12 + "]";
	}
}
