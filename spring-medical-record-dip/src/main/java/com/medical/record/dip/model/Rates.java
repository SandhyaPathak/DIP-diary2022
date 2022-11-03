package com.medical.record.dip.model;

public class Rates {
	private double heartRate;
	private double Spo2;
	private double pulse;
	private double bloodPressure;
	public double getHeartRate() {
		return heartRate;
	}
	public void setHeartRate(double heartRate) {
		this.heartRate = heartRate;
	}
	public double getSpo2() {
		return Spo2;
	}
	public void setSpo2(double spo2) {
		Spo2 = spo2;
	}
	public double getPulse() {
		return pulse;
	}
	public void setPulse(double pulse) {
		this.pulse = pulse;
	}
	public double getBloodPressure() {
		return bloodPressure;
	}
	public void setBloodPressure(double bloodPressure) {
		this.bloodPressure = bloodPressure;
	}
	@Override
	public String toString() {
		return "Rates [heartRate=" + heartRate + ", Spo2=" + Spo2 + ", pulse=" + pulse + ", bloodPressure="
				+ bloodPressure + "]";
	}
}
