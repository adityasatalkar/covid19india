package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GujaratDistrictData {

	@SerializedName("Rajkot")
	@Expose
	private Rajkot rajkot;
	@SerializedName("Surat")
	@Expose
	private Surat surat;
	@SerializedName("Ahmedabad")
	@Expose
	private Ahmedabad ahmedabad;
	@SerializedName("Vadodara")
	@Expose
	private Vadodara vadodara;
	@SerializedName("Gandhinagar")
	@Expose
	private Gandhinagar gandhinagar;
	@SerializedName("Kutch")
	@Expose
	private Kutch kutch;
	@SerializedName("Unknown")
	@Expose
	private GujaratUnknownDistrict unknown;

	public Rajkot getRajkot() {
		return rajkot;
	}

	public void setRajkot(Rajkot rajkot) {
		this.rajkot = rajkot;
	}

	public Surat getSurat() {
		return surat;
	}

	public void setSurat(Surat surat) {
		this.surat = surat;
	}

	public Ahmedabad getAhmedabad() {
		return ahmedabad;
	}

	public void setAhmedabad(Ahmedabad ahmedabad) {
		this.ahmedabad = ahmedabad;
	}

	public Vadodara getVadodara() {
		return vadodara;
	}

	public void setVadodara(Vadodara vadodara) {
		this.vadodara = vadodara;
	}

	public Gandhinagar getGandhinagar() {
		return gandhinagar;
	}

	public void setGandhinagar(Gandhinagar gandhinagar) {
		this.gandhinagar = gandhinagar;
	}

	public Kutch getKutch() {
		return kutch;
	}

	public void setKutch(Kutch kutch) {
		this.kutch = kutch;
	}

	public GujaratUnknownDistrict getUnknown() {
		return unknown;
	}

	public void setUnknown(GujaratUnknownDistrict unknown) {
		this.unknown = unknown;
	}

}
