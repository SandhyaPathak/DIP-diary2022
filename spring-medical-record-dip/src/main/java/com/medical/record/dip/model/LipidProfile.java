package com.medical.record.dip.model;

public class LipidProfile {
	private double ldl;
	private double hdl;
	private double vldl;
	private double triglycerides;
	public double getLdl() {
		return ldl;
	}
	public void setLdl(double ldl) {
		this.ldl = ldl;
	}
	public double getHdl() {
		return hdl;
	}
	public void setHdl(double hdl) {
		this.hdl = hdl;
	}
	public double getVldl() {
		return vldl;
	}
	public void setVldl(double vldl) {
		this.vldl = vldl;
	}
	public double getTriglycerides() {
		return triglycerides;
	}
	public void setTriglycerides(double triglycerides) {
		this.triglycerides = triglycerides;
	}
	@Override
	public String toString() {
		return "LipidProfile [ldl=" + ldl + ", hdl=" + hdl + ", vldl=" + vldl + ", triglycerides=" + triglycerides
				+ "]";
	}
	

}
