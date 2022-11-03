package com.medical.record.dip.model;

public class LiverFunction {
	private double sgpt;
	private double aluminium;
	private double alp;
	public double getSgpt() {
		return sgpt;
	}
	public void setSgpt(double sgpt) {
		this.sgpt = sgpt;
	}
	public double getAluminium() {
		return aluminium;
	}
	public void setAluminium(double aluminium) {
		this.aluminium = aluminium;
	}
	public double getAlp() {
		return alp;
	}
	public void setAlp(double alp) {
		this.alp = alp;
	}
	@Override
	public String toString() {
		return "LiverFunction [sgpt=" + sgpt + ", aluminium=" + aluminium + ", alp=" + alp + "]";
	}
}
