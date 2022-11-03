package com.medical.record.dip.model;

public class ThyroidProfile {
	
	private double t3;
	private double t4;
	private double tsh;
	public double getT3() {
		return t3;
	}
	public void setT3(double t3) {
		this.t3 = t3;
	}
	public double getT4() {
		return t4;
	}
	public void setT4(double t4) {
		this.t4 = t4;
	}
	public double getTsh() {
		return tsh;
	}
	public void setTsh(double tsh) {
		this.tsh = tsh;
	}
	@Override
	public String toString() {
		return "ThyroidProfile [t3=" + t3 + ", t4=" + t4 + ", tsh=" + tsh + "]";
	}
}
