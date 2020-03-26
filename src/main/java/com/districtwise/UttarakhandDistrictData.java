package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UttarakhandDistrictData {

	@SerializedName("Unknown")
	@Expose
	private UttarakhandUnknownDistrict unknown;
	@SerializedName("Pauri")
	@Expose
	private Pauri pauri;

	public UttarakhandUnknownDistrict getUnknown() {
		return unknown;
	}

	public void setUnknown(UttarakhandUnknownDistrict unknown) {
		this.unknown = unknown;
	}

	public Pauri getPauri() {
		return pauri;
	}

	public void setPauri(Pauri pauri) {
		this.pauri = pauri;
	}

}
