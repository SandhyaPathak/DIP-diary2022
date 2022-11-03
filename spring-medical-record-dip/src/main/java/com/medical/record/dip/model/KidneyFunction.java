package com.medical.record.dip.model;

public class KidneyFunction {
	private double urea;
	private double uricAcid;
	private double creatine;
	public double getUrea() {
		return urea;
	}
	public void setUrea(double urea) {
		this.urea = urea;
	}
	public double getUricAcid() {
		return uricAcid;
	}
	public void setUricAcid(double uricAcid) {
		this.uricAcid = uricAcid;
	}
	public double getCreatine() {
		return creatine;
	}
	public void setCreatine(double creatine) {
		this.creatine = creatine;
	}
	@Override
	public String toString() {
		return "KidneyFunction [urea=" + urea + ", uricAcid=" + uricAcid + ", creatine=" + creatine + "]";
	}
}
