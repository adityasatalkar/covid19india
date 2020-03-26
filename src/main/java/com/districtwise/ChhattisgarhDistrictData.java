package com.districtwise;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChhattisgarhDistrictData {

	@SerializedName("Unknown")
	@Expose
	private ChhattisgarhUnknownDistrict unknown;

	public ChhattisgarhUnknownDistrict getUnknown() {
		return unknown;
	}

	public void setUnknown(ChhattisgarhUnknownDistrict unknown) {
		this.unknown = unknown;
	}

}
