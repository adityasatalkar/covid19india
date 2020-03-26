package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MizoramDistrictData {

	@SerializedName("Unknown")
	@Expose
	private MizoramUnknownDistrict unknown;

	public MizoramUnknownDistrict getUnknown() {
		return unknown;
	}

	public void setUnknown(MizoramUnknownDistrict unknown) {
		this.unknown = unknown;
	}

}
