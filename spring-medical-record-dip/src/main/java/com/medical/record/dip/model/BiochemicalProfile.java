package com.medical.record.dip.model;

public class BiochemicalProfile {
	private double cbl;
	private double ctll;
	private double dlc;
	private double h3;
	private double plateletCount;
	public double getCbl() {
		return cbl;
	}
	public void setCbl(double cbl) {
		this.cbl = cbl;
	}
	public double getCtll() {
		return ctll;
	}
	public void setCtll(double ctll) {
		this.ctll = ctll;
	}
	public double getDlc() {
		return dlc;
	}
	public void setDlc(double dlc) {
		this.dlc = dlc;
	}
	public double getH3() {
		return h3;
	}
	public void setH3(double h3) {
		this.h3 = h3;
	}
	public double getPlateletCount() {
		return plateletCount;
	}
	public void setPlateletCount(double plateletCount) {
		this.plateletCount = plateletCount;
	}
	@Override
	public String toString() {
		return "BiochemicalProfile [cbl=" + cbl + ", ctll=" + ctll + ", dlc=" + dlc + ", h3=" + h3 + ", plateletCount="
				+ plateletCount + "]";
	}
}
