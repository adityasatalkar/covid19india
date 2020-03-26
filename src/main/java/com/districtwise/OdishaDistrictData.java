package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OdishaDistrictData {

	@SerializedName("Unknown")
	@Expose
	private OdishaUnknownDistrict unknown;

	public OdishaUnknownDistrict getUnknown() {
		return unknown;
	}

	public void setUnknown(OdishaUnknownDistrict unknown) {
		this.unknown = unknown;
	}

}
